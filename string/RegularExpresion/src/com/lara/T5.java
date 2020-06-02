package com.lara;

import java.text.NumberFormat;

public class T5 {
    public static void main(String[] args) {
		double num = 234546.56786;
		System.out.println(num);
		NumberFormat nf = NumberFormat.getInstance();
		String s1 = nf.format(num);
		System.out.println(s1);
	}
}
