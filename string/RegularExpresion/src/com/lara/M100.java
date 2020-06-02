package com.lara;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class M100 {
   public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();
	cal.add(Calendar.YEAR,-5);
	Date d1 = cal.getTime();
	System.out.println(d1);
	DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
	String s1 = df.format(d1);
	System.out.println(s1);
			
}
}
//DateForamat is used for formating a date to string