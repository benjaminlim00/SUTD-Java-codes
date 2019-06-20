package com.example.benjamin.folksong;

//— -copy and paste from this line onwards — -

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;


public class FolksongsDbHelper extends SQLiteOpenHelper {

    Context context;
    public static final int DATABASE_VERSION = 1;
    String TAG = "Logcat";

    FolksongsDbHelper(Context context) {
        super(context, FolksongsDatabase.FolksongsTable.TABLE_NAME, null, DATABASE_VERSION);
        this.context = context;

        //this.jsonArray = jsonArray;
    }

    //TODO 2.1 - override the necessary methods
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(FolksongsDatabase.FolksongsTable.SQL_CREATE_TABLE);
        fillTable(sqLiteDatabase);
        Log.d(TAG, "oncreate database started");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(FolksongsDatabase.FolksongsTable.SQL_DELETE_TABLE);
        onCreate(sqLiteDatabase);
    }


    //TODO 2.2 - write the method that fills the table when it is created

    private void fillTable(SQLiteDatabase sqLiteDatabase) {

        ArrayList<FolksongData> arrayList = new ArrayList<>();

        //open the Json file pictures stored in the res/raw folder
        InputStream inputStream = context.getResources().openRawResource(R.raw.folksongs);
        String string = Utils.convertStreamToString(inputStream);


        //parse the Json file and store data in the ArrayList
        try {
            JSONArray jsonArray = new JSONArray(string);
            for (int i = 0; i <= jsonArray.length(); i++) {
                String countryJson = jsonArray.getJSONObject(i).getString("country");
                String titleJson = jsonArray.getJSONObject(i).getString("title");
                arrayList.add(new FolksongsDbHelper.FolksongData(countryJson, titleJson));
                Log.d(TAG, "Creating into database, country: " + countryJson + " title: " + titleJson);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, "ERROR IN CREATING DATABASE");

        }

        //Each entry in the arrayList is stored as a ContentValues object
        //Then this ContentValues object is inserted to the sqLiteDatabase to create a new row
        for (int i = 0; i < arrayList.size(); i++) {
            ContentValues cv = new ContentValues();
            cv.put(FolksongsDatabase.FolksongsTable.COL_COUNTRY, arrayList.get(i).getCountry());
            cv.put(FolksongsDatabase.FolksongsTable.COL_TITLE, arrayList.get(i).getTitle());
            sqLiteDatabase.insert(FolksongsDatabase.FolksongsTable.TABLE_NAME, null, cv);
        }

    }

    public class FolksongData {
        private String title;
        private String country;

        public String getTitle() {
            return title;
        }

        public String getCountry() {
            return country;
        }


        //make sure we didn't swap this accidentally!!!!!!!!!!!!!!!!!! Check the order in the constuctor
        public FolksongData(String country, String title) {
            this.country = country;
            this.title = title;
        }
    }

    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + FolksongsDatabase.FolksongsTable.TABLE_NAME, null);
        return res;
    }


    public String getTitle(String country) {
        Cursor cursor = null;
        SQLiteDatabase db = this.getReadableDatabase();

        //long count = DatabaseUtils.queryNumEntries(db, TABLE_NAME);
        //Log.d(TAG, "testcount: " + count);


        try {
            // this is wrong.
            //cursor = db.rawQuery("SELECT " + FolksongsDatabase.FolksongsTable.COL_TITLE + " FROM " + FolksongsDatabase.FolksongsTable.TABLE_NAME + " WHERE " + FolksongsDatabase.FolksongsTable.COL_COUNTRY +"=?", new String[] {country + ""});
            //cursor = db.rawQuery("SELECT " + FolksongsDatabase.FolksongsTable.COL_TITLE + " FROM " + FolksongsDatabase.FolksongsTable.TABLE_NAME + " WHERE " + FolksongsDatabase.FolksongsTable.COL_COUNTRY +" = Korea", null);

            //also wrong
//            String query = "select title from Folksongs where (country = \"Korea\")";
//            cursor = db.rawQuery(query, null);


            //to find out column names
            /*Cursor dbCursor = db.query("Folksongs", null, null, null, null, null, null);
            String[] columnNames = dbCursor.getColumnNames();
            Log.d(TAG, "column names are: " + Arrays.toString(columnNames));*/

            //this gets all data, then we handle it
            cursor = db.rawQuery("select * from " + FolksongsDatabase.FolksongsTable.TABLE_NAME, null);
            //Log.d(TAG, "before if loop, cursor.getCount()= " + cursor.getCount());
            StringBuffer buffer = new StringBuffer();
            while (cursor.moveToNext()) {
                //int cid =cursor.getInt(cursor.getColumnIndex(myDbHelper.UID));
                //String title =cursor.getString(cursor.getColumnIndex(myDbHelper.NAME));
                //String  password =cursor.getString(cursor.getColumnIndex(myDbHelper.MyPASSWORD));

                //IDK WHY SWAPPED - FIXED
                String countryhere = cursor.getString(cursor.getColumnIndex(FolksongsDatabase.FolksongsTable.COL_COUNTRY));
                String titlehere = cursor.getString(cursor.getColumnIndex(FolksongsDatabase.FolksongsTable.COL_TITLE));


                //Log.d(TAG, "titlehere: " + titlehere);


//                Log.d(TAG, "countryhere: " + countryhere);
//                Log.d(TAG, "country: " + country);
//                Log.d(TAG, "bool compare: " + (countryhere.equals(country)));


                if (countryhere.equals(country)) {
                    //break; , not working as i will get data even when i am not supposed to
                    buffer.append(titlehere);
                }
            }
            Log.d(TAG, "returning this: " + buffer.toString());
            return buffer.toString();
        } finally {
            cursor.close();
        }
    }
}




