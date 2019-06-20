package com.example.benjamin.folksongsseniorans;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    JSONArray jsonArray;
    SQLiteDatabase folksongsDatabase;
    Button getSongButton;
    EditText country;
    TextView songResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parseJson();
        getSongButton = findViewById(R.id.getSongButton);
        country = findViewById(R.id.country);
        songResult = findViewById(R.id.songResult);
        FolksongsDbHelper folksongsDbHelper = new FolksongsDbHelper(this,jsonArray);
        folksongsDatabase = folksongsDbHelper.getWritableDatabase();

        //TODO 3.1 - update the XML Layout file to meet your needs
        //TODO 3.2 - see below
        //TODO 3.3 - complete this MainActivity class to meet the requirements of the question
    }

    public void onClickGetSong(View view){
        String countryName = country.getText().toString().toLowerCase();
        countryName = countryName.substring(0,1).toUpperCase() + countryName.substring(1);
        Cursor cursor = folksongsDatabase.rawQuery("SELECT * FROM "+
                FolksongsDatabase.FolksongsTable.TABLE_NAME,null);
        int titleID = cursor.getColumnIndex(FolksongsDatabase.FolksongsTable.COL_TITLE);
        int countryID = cursor.getColumnIndex(FolksongsDatabase.FolksongsTable.COL_COUNTRY);
        String songName="";
        String countryFromDb;
        while (cursor.moveToNext()){
            songName = cursor.getString(titleID);
            countryFromDb = cursor.getString(countryID);
            if (countryFromDb.equals(countryName)){
                break;
            }
        }
        songResult.setText(songName);
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
        try {
            String jsonString = convertJsonToString(R.raw.folksongs);
            jsonArray = new JSONArray(jsonString);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
