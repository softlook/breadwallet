package com.bfactory.breadwallet;

import android.database.sqlite.SQLiteDatabase;

public class AppConfig {
	private static AppConfig _instance = new AppConfig();
	
	//private SQLiteDatabase db;
	
	private AppConfig() {
		
	}
	
	public static AppConfig getInstance() {
		return _instance;
	}
	
	public boolean initiate(String configPath) {
		SQLiteDatabase.openOrCreateDatabase(configPath, null);
		
		return true;
	}
}
