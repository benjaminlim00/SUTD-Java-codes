package com.example.benjamin.folksong;

//- - - copy and paste from this point onwards  - - -

import android.provider.BaseColumns;

public class FolksongsDatabase {

    public static final class FolksongsTable implements BaseColumns{

        public static final String TABLE_NAME = "Folksongs";
        public static final String COL_TITLE = "title";
        public static final String COL_COUNTRY = "country";

        public static String SPACE = " ";
        public static String COMMA = ",";

        //TODO 1 - make the SQL commands to create a table and delete a table
        public static final String SQL_CREATE_TABLE = "CREATE TABLE" + SPACE
                + FolksongsTable.TABLE_NAME + SPACE + "("
                + FolksongsTable._ID + SPACE + "INTEGER PRIMARY KEY AUTOINCREMENT" + COMMA
                + FolksongsTable.COL_COUNTRY + SPACE + "TEXT NOT NULL" + COMMA
                + FolksongsTable.COL_TITLE + SPACE + "TEXT NOT NULL" + ");" ;

        public static final String SQL_DELETE_TABLE = "DROP TABLE IF EXISTS " + FolksongsTable.TABLE_NAME;





    

    }
}
