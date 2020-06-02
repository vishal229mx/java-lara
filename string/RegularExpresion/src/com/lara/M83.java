package com.lara;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M83{
   public static void main(String[] args) 
{
     //String src = "abc.xyz.test@hello";
     //String src = "abc@hello";
	 //String src = "abc.xyz@hello";
	   String src = "abc.xyz.test.java.blr@hello";
	   String exp ="^[a-z]([a-z]+\\.)*[a-z]+@[a-z]+$";
    Pattern p1 = Pattern.compile(exp);
    Matcher m1 = p1.matcher(src);
    System.out.println(m1.find());
}
}
//$ represent ending of the string
//minimum one character is a .
//* represent 0 , 1.......and more and  + represent one more
//
