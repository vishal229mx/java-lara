package com.lara;


public class T9 
{
    public static void main(String[] args) 
    {
    	String s1 = String.format("Math marks are %d", 100);
    	System.out.println(s1);
    	System.out.printf("Math marks are %d", 100);
    }
		
}

/*
 *jdk1.5
 *formatters formating string format is
 *================================================
 *%[arg_index$][flags][width][.precision]conversion char type
 *
 *flags
 *---------
 * - left alignment
 * + explicit +ve sign to the +ve numbers
 * 0 passing with 0 for all left un occupied places.
 * ( to enclose -ve number in the brackets
 * , to grouping digits in a number
 * 
 * conversion char type 
 * ---------------------
 * byte, short, int, long ====> d
 * float, double ====> f
 * boolean =====> b
 * char ====> c
 * String ===> s
 */