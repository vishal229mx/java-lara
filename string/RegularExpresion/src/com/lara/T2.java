package com.lara;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class T2 {
    public static void main(String[] args) {
    	Calendar cal = Calendar.getInstance();
    	cal.add(Calendar.YEAR,-5);
    	Date d1 = cal.getTime();
    	System.out.println(d1);
    	
    	//SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    	//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    	SimpleDateFormat sdf = new SimpleDateFormat("E-dd/MMMM/yyyy",Locale.ITALY);
       	String s1 = sdf.format(d1);
    	System.out.println("full:"+s1);
    	
    			
    }
	}
//simpleDateForamt.com