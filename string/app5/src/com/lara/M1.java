package com.lara;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M1 {
         public static void main(String[] args) {
			String src = "Hello 123 Hello again";
			String exp = "Hello";
			Pattern p1 = Pattern.compile(exp);//define a pattern
			Matcher m1 = p1.matcher(src);//Search 
			while (m1.find())
			{
			 System.out.println(m1.group() + " @ " + m1.start());
			}
		}
}
//every occurrence of expression of a given source 
//inside a source search all the occurrence find out all the matcher , 
//all the matcher returning to matcher are returning to matcher object
//find() keep on returing a true as long as matcher are there