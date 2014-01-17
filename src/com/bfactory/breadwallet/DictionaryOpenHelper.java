package com.bfactory.breadwallet;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DictionaryOpenHelper extends SQLiteOpenHelper {
	private static final String DATABASE_NAME = "kvstore";
	private static final int DATABASE_VERSION = 2;
    private static final String DICTIONARY_TABLE_NAME = "kvtable";
    private static final String DICTIONARY_TABLE_CREATE =
    		 "CREATE TABLE " + DICTIONARY_TABLE_NAME + " (" +
    	                "k TEXT, " +
    	                "v TEXT);";
    
    public DictionaryOpenHelper(Context context) {
    	super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(DICTIONARY_TABLE_CREATE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

}
