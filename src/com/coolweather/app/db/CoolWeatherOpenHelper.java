package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
/**
 * Province 表建表语句
 */
	public static final String CREATOR_PROVINCE = "creat table Province("
												  +"id integer primary key autoincrement," 
												  +"province_name text,"
												  +"province_code text)" ;
	/**
	 * City表建表语句
	 */
	public static final String CREATOR_CITY = "creat table City("
			  +"id integer primary key autoincrement," 
			  +"city_name text,"
			  +"city_code text)" 
			  +"province_in integer)" ;
	/**
	 * County表建表语句
	 */
	public static final String CREATOR_COUNTY = "creat table County("
			  +"id integer primary key autoincrement," 
			  +"county_name text,"
			  +"county_code text)" 
			  +"city_id ineger)" ;
	
	
	public CoolWeatherOpenHelper(Context context, String name,CursorFactory factory, int version)
	{
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(CREATOR_PROVINCE);//创建Province表
		db.execSQL(CREATOR_CITY);//创建City表
		db.execSQL(CREATOR_COUNTY); //创建County表
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
