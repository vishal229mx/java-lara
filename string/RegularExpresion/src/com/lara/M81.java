package com.lara;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M81 {
    public static void main(String[] args)
    {
	  String src = "abc@hello";
	  String  exp = "[a-z]+[a-z]+";
	  Pattern p1 = Pattern.compile(exp);
	  Matcher m1 = p1.matcher(src);
	  System.out.println(m1.find());
	}
}
