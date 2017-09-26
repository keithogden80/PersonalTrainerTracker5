package com.bignerdranch.android.personaltrainertracker.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by k on 9/25/2017.
 */

public class CustomerBaseHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "customerBase.db";

    public CustomerBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + CustomerDbSchema.CustomerTable.Cols.LNAME + "(" +
            " _id integer primary key autoincrement," +
            CustomerDbSchema.CustomerTable.Cols.UUID +"," +
             CustomerDbSchema.CustomerTable.Cols.FNAME + "," +
                CustomerDbSchema.CustomerTable.Cols.CCARD + "," +
                CustomerDbSchema.CustomerTable.Cols.CCEXP + "," +
                CustomerDbSchema.CustomerTable.Cols.EMAIL + ")"
        );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
