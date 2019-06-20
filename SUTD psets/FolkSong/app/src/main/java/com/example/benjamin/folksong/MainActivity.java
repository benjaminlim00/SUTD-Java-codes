package com.example.benjamin.folksong;

// - - copy and paste from this point onwards 

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    //JSONArray jsonArray;
    Button button;
    EditText editText;
    TextView result;
    String TAG = "ben";
    FolksongsDbHelper dbhelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dbhelper = new FolksongsDbHelper(this);
        checkDb();


        //TODO 3.1 - update the XML Layout file to meet your needs
        //TODO 3.2 - see below
        //TODO 3.3 - complete this MainActivity class to meet the requirements of the question

        result = findViewById(R.id.result);


        editText = findViewById(R.id.editText);


        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                String countrySmall = editText.getText().toString().toLowerCase();
                String countryCaps = countrySmall.toUpperCase();
                String country = countryCaps.substring(0,1) + countrySmall.substring(1);

                Log.d(TAG, "country: " + country);

                if (country == "") {
                    Toast.makeText(MainActivity.this, "PLEASE key something in", Toast.LENGTH_LONG).show();
                } else {
                    try {
                        String countryResult = dbhelper.getTitle(country);
                        Log.d(TAG, "countryResult: " + countryResult);
                        result.setText(countryResult);
                        Toast.makeText(MainActivity.this, "success", Toast.LENGTH_LONG).show();


                    } catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(MainActivity.this, "Error occured", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

    }

    public void checkDb() {
        Cursor res = dbhelper.getAllData();
        if(res.getCount() == 0) {
            // show message
            Toast.makeText(MainActivity.this,"Error, Nothing found", Toast.LENGTH_LONG).show();
            return;
        }
        StringBuffer buffer = new StringBuffer();
        while (res.moveToNext()) {
            //HERE TOO - FIXED
            buffer.append("Countries: "+ res.getString(res.getColumnIndex(FolksongsDatabase.FolksongsTable.COL_COUNTRY))+"\n");
            buffer.append("Title: "+ res.getString(res.getColumnIndex(FolksongsDatabase.FolksongsTable.COL_TITLE))+"\n");
        }
        Toast.makeText(MainActivity.this,buffer.toString(), Toast.LENGTH_LONG).show();
        return;


    }

}












/*

    private String convertJsonToString(int resource){

        String line;
        String output = "";

        InputStream inputStream = getResources().openRawResource(resource);
        BufferedReader reader = new BufferedReader( new InputStreamReader(inputStream));

        try{
            while( (line = reader.readLine()) != null){
                output = output + line;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return output;
    }

    //TODO 3.2 - complete this method


    protected void parseJson(){
        try {
            String jsonString = convertJsonToString(R.raw.folksongs);
            jsonArray = new JSONArray(jsonString);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    */