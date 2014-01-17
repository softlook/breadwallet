package com.bfactory.breadwallet;

import android.content.Context;

public class AppConfig {
	private static AppConfig _instance = new AppConfig();
	
	//private SQLiteDatabase db;
	
	public DictionaryOpenHelper configDict;
	
	private AppConfig() {
		
	}
	
	public static AppConfig getInstance() {
		return _instance;
	}
	
	public boolean initiate(Context context) {
		AppConfig.getInstance().configDict = new DictionaryOpenHelper(context);
		
		return true;
	}
}
