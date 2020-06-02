package com.lara;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M8 {
	 public static void main(String[] args) {
			//String src = "hello1 j2v3 u5 v2 9821";
		    String src = "hello to all. find all the best. how do you do, where are you?";
			String exp = "[\\s+(\\.\\s+)(,\\s+)]"; 
			Pattern p1 = Pattern.compile(exp);//define a pattern
			Matcher m1 = p1.matcher(src);//Search 
			while (m1.find())
			{
			 System.out.println(m1.group() + " @ " + m1.start());
			}
		}
}
//lets find occurrence of 2 and 1 also from left to right
//String exp = "[1-4]";  here occurrence 1, 2, 3, 4 
//similar to 1 one 4 i required alphabet also
//you can supply multiple way String exp = "[a-n1-7]"; 
//to give a every digit String exp = "[0123456789]"; 
//String exp = "\\d";  all the digit are occurrences
//\\d+ continue , similarly go for capital \\D apart from a digit reaming all