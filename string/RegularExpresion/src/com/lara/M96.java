package com.lara;

import java.util.Calendar;
import java.util.Date;

public class M96 {
   public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();
	cal.add(Calendar.DATE,-7);
	Date d1 = cal.getTime();
	System.out.println(d1);
			
}
}