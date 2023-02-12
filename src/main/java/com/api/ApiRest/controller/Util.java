package com.api.ApiRest.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

	public static Date conversorStringToDate(String dateString) {
		
		Date date = null;
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			date = format.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		
		return date;
	}
}
