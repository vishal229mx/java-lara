package com.lara;

import java.text.NumberFormat;
import java.util.Locale;

public class T6 {
    public static void main(String[] args) {
		double num = 234546.56786;
		System.out.println(num);
		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
		String s1 = nf.format(num);
		System.out.println(s1);
	}
}
