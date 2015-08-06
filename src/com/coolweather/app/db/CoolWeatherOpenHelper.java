package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
/**
 * Province �������
 */
	public static final String CREATOR_PROVINCE = "create table Province("
												  +"id integer primary key autoincrement," 
												  +"province_name text,"
												  +"province_code text)" ;
	/**
	 * City�������
	 */
	public static final String CREATOR_CITY = "create table City("
			  +"id integer primary key autoincrement," 
			  +"city_name text,"
			  +"city_code text," 
			  +"province_id integer)" ;
	/**
	 * County�������
	 */
	public static final String CREATOR_COUNTY = "create table County("
			  +"id integer primary key autoincrement," 
			  +"county_name text,"
			  +"county_code text," 
			  +"city_id ineger)" ;
	
	
	public CoolWeatherOpenHelper(Context context, String name,CursorFactory factory, int version)
	{
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(CREATOR_PROVINCE);//����Province��
		db.execSQL(CREATOR_CITY);//����City��
		db.execSQL(CREATOR_COUNTY); //����County��
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
