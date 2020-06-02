package com.lara;

import java.util.Calendar;
import java.util.Date;

public class M95 {
   public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();
	cal.add(Calendar.DATE,1);
	Date d1 = cal.getTime();
	System.out.println(d1);
			
}
}