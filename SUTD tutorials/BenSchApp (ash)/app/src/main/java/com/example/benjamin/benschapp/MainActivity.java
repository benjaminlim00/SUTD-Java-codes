package com.example.benjamin.benschapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> images;
    Button charaButton;
    Button charaButtonInitial;
    ImageView charaImage;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // R-class is the access point to the resources.
        // copying pictures into drawable file: file names must be in lower-case.
        // id names cannot have underscores.

        //TODO 1.3 Instantiate an ArrayList object
        images = new ArrayList<>();
        //TODO 1.4 Add the image IDs to the ArrayList
        images.add(R.drawable.garfield);
        images.add(R.drawable.bartsimpson);
        images.add(R.drawable.doraemon);
        images.add(R.drawable.dory);
        images.add(R.drawable.yoda);
        images.add(R.drawable.pikachu);
        images.add(R.drawable.tomandjerry);
        images.add(R.drawable.ashketchum);

        //TODO 1.5 Get references to charaButton and charaImage using findViewById
        charaButton = findViewById(R.id.charaButton);
        charaImage = findViewById(R.id.charaImage);
        charaButtonInitial = findViewById(R.id.charaButtonInitial);
        // TODO 1.6 For charaButton, invoke the setOnClickListenerMethod
        // TODO 1.7 Create an anonymous class which implements View.OnClickListener
        // TODO 1.8 Write code to randomly select an image ID from the ArrayList and display it in the ImageView
        charaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = (count)%images.size();
                count += 1;

                int id = images.get(index);
                charaImage.setImageResource(id);
            }
        });

        charaButtonInitial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = images.get(7);
                charaImage.setImageResource(id);
            }
        });
//      //TODO 1.9 [On your own] Create another Button to always display the first image



    }



}
