package com.lara;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M5 {
	 public static void main(String[] args) {
			String src = "Hello Java Hello Java again and also java";
			String exp = "\\s";//where ever white spaces are there \\s represent white spaces
			Pattern p1 = Pattern.compile(exp);//define a pattern
			Matcher m1 = p1.matcher(src);//Search 
			while (m1.find())
			{
			 System.out.println(m1.group() + " @ " + m1.start());
			}
		}
}
