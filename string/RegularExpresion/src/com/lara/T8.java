package com.lara;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class T8 {
    public static void main(String[] args) {
		double num = 234546.56786;
		System.out.println(num);
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.UK);
		String s1 = nf.format(num);
		try
		{
			double num1 = (Double) nf.parse(s1);
			System.out.println(num1);
		} 
		catch (ParseException ex)
		{
		}
		System.out.println(s1);
	}
}
