package com.lara;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M10 {
	 public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
		    System.out.println("enter email id");
		    String email = sc.next();
		    //String exp = "^[a-zA-Z]+@[a-zA-Z]+$";
		    //String exp = "^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z][a-zA-Z0-9]+\\.[a-zA-Z]{2, 3}$";
		    String exp = "^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z][a-zA-Z0-9]+\\.[a-zA-Z]{2,3}$";
		    Pattern p1 = Pattern.compile(exp);
		    Matcher m1 = p1.matcher(email);
		    if(m1.find())
		    {
		    	System.out.println(email + " is valid");
		    }
		    else
		    {
		    	System.out.println(email +" is not valid");
		    }
		}
}
// ^ Tow starting represent minimum one character ,$ represent ending of the string a
//alphabet should be occurrence in first, digits are not allowed in beginning itself its allowed in second