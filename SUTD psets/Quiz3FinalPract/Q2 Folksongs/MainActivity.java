package com.example;

// - - copy and paste from this point onwards 

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    JSONArray jsonArray;
    SQLiteDatabase folksongsDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parseJson();

        //TODO 3.1 - update the XML Layout file to meet your needs
        //TODO 3.2 - see below
        //TODO 3.3 - complete this MainActivity class to meet the requirements of the question
    }

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

        String jsonString = convertJsonToString();
	jsonArray = new JSONArray(jsonString);
 
    }
}
