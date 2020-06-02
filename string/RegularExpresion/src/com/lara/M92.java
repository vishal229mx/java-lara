package com.lara;

import java.util.Date;

public class M92 {
   public static void main(String[] args) {
	Date d1 = new Date();
	Date d2 = new Date(d1.getTime());
	System.out.println(d1);
	System.out.println(d2);
			
}
}
//d1.getTime(); it is return a total number of millisecond 