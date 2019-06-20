package com.example;

//— -copy and paste from this line onwards — -

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import org.json.JSONArray;
import org.json.JSONObject;


public class FolksongsDbHelper extends SQLiteOpenHelper {

    Context context;
    JSONArray jsonArray;
    public static final int DATABASE_VERSION = 1;

    FolksongsDbHelper(Context context, JSONArray jsonArray){
        super(context, FolksongsDatabase.FolksongsTable.TABLE_NAME, null,DATABASE_VERSION);
        this.context = context;
        this.jsonArray = jsonArray;
    }

    //TODO 2.1 - override the necessary methods
    //TODO 2.2 - write the method that fills the table when it is created

}
