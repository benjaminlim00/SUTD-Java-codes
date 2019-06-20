package com.example.norman_lee.displayingdatanew;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CharaAdapter extends RecyclerView.Adapter<CharaAdapter.CharaViewHolder>{

    LayoutInflater mInflater;
    Context context;
    CharaDbHelper charaDbHelper;

    //link recycle view to database
    //TODO 9.3 Constructor takes in a context object and a CharaDbHelper object
    //TODO 9.3 assign the inputs to instance variables
    public CharaAdapter(Context context, CharaDbHelper charaDbHelper) {
        mInflater = LayoutInflater.from(context);

        this.context = context;
        this.charaDbHelper = charaDbHelper;
    }

    //TODO 9.4 onCreateViewHolder inflates each CardView layout (no coding)
    //this method of the CharaAdapter returns a CharaViewHolder which which is a holder.
    @NonNull
    @Override
    public CharaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //here we inflate the view. then we access the view and put it inside the holder.
        View itemView = mInflater.inflate(R.layout.layout, viewGroup, false);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "OUCH", Toast.LENGTH_SHORT).show();
            }
        });
        return new CharaViewHolder(itemView);
    }

    //TODO 9.5 onBindViewHolder binds the data to each card according to its position
    @Override
    public void onBindViewHolder(@NonNull CharaViewHolder charaViewHolder, int i) {
        // this takes one row of data from the database and feeds data inside the holder.
        CharaDbHelper.CharaData charaData = charaDbHelper.queryOneRow(i);
        charaViewHolder.textViewName.setText(charaData.getName());
        charaViewHolder.textViewDescription.setText(charaData.getDescription());
        charaViewHolder.textViewPosition.setText(Integer.toString(i));
        charaViewHolder.imageViewChara.setImageBitmap(charaData.getBitmap());

    }

    //TODO 9.6 this method controls the number of cardviews in the recyclerview
    @Override
    public int getItemCount() {
        int numberOfRows = (int) charaDbHelper.queryNumRows();
        return numberOfRows;
    }

    //TODO 9.2 Complete the constructor to initialize the widgets
    //this is a inner class. Holder is the small holder within the recyclerview that is used to hold one of the many rows.
    class CharaViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewName;
        public TextView textViewDescription;
        public TextView textViewPosition;
        public ImageView imageViewChara;

        public CharaViewHolder(View view){  //this view points to the CardView, we should point the view to all the variables
            super(view);
            textViewName = view.findViewById(R.id.cardViewTextName);
            textViewDescription = view.findViewById(R.id.cardViewTextDescription);
            textViewPosition = view.findViewById(R.id.cardViewTextCount);
            imageViewChara = view.findViewById(R.id.cardViewImage);

        }



    }
}
