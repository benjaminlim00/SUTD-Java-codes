package com.example.benjamin.folksongsseniorans;

/**
 * Created by User on 1/12/2017.
 */

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

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        final String SQL_CREATE_TABLE = FolksongsDatabase.FolksongsTable.SQL_CREATE_TABLE;
        sqLiteDatabase.execSQL(SQL_CREATE_TABLE);
        try {
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                ContentValues cv = new ContentValues();
                cv.put(FolksongsDatabase.FolksongsTable.COL_COUNTRY, jsonObject.getString("country"));
                cv.put(FolksongsDatabase.FolksongsTable.COL_TITLE, jsonObject.getString("title"));
                sqLiteDatabase.insert(FolksongsDatabase.FolksongsTable.TABLE_NAME, null, cv);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        final String SQL_DELETE_TABLE = FolksongsDatabase.FolksongsTable.SQL_DELETE_TABLE;
        sqLiteDatabase.execSQL(SQL_DELETE_TABLE);
        onCreate(sqLiteDatabase);
    }

    //TODO 2.1 - override the necessary methods
    //TODO 2.2 - write the method that fills the table when it is created

}


