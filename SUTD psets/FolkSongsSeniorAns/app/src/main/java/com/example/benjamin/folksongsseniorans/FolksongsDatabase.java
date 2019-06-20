package com.example.benjamin.folksongsseniorans;

/**
 * Created by User on 1/12/2017.
 */

import android.provider.BaseColumns;

public class FolksongsDatabase {

    public static final class FolksongsTable implements BaseColumns{

        public static final String TABLE_NAME = "Folksongs";
        public static final String COL_TITLE = "title";
        public static final String COL_COUNTRY = "country";

        //TODO 1 - make the SQL commands to create a table and delete a table
        public static final String SQL_CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("+
                COL_COUNTRY+" TEXT NOT NULL,\n" +
                COL_TITLE+ " TEXT NOT NULL )";

        public static final String SQL_DELETE_TABLE = "DROP TABLE IF EXISTS FolkSongs";


    }
}