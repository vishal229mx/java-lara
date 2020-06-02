package com.lara;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class T3 {
	public static void main(String[] args) {
    	Calendar cal = Calendar.getInstance();
    	cal.add(Calendar.YEAR,-5);
    	Date d1 = cal.getTime();
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("E-dd/MMMM/yyyy",Locale.ITALY);
       	String s1 = sdf.format(d1);
    	System.out.println(s1);
    	try 
    	{
			Date d2 = sdf.parse(s1);
			System.out.println(d2);
		} 
    	catch (ParseException ex)
    	{
          ex.printStackTrace();
		}
    	
    			
    }
} 
