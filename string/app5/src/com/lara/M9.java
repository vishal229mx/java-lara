package com.lara;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M9 {
	 public static void main(String[] args) {

		    String src = "hello to all. find all the best.       how do you do, where are you?";
		    System.out.println(src);
			//String seprator = "\\. \\s+";
		    String seprator = "[\\.,]?\\s+";
			String[] splits = src.split(seprator);
			for(String split : splits)
			{
				System.out.println(split);
			}
		}
}
// ? represent 0 number of occurrence either 1