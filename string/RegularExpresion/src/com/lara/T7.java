package com.lara;

import java.text.NumberFormat;
import java.util.Locale;

public class T7 {
    public static void main(String[] args) {
		double num = 234546.56786;
		System.out.println(num);
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.UK);
		String s1 = nf.format(num);
		System.out.println(s1);
	}
}
