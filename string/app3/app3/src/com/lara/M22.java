package com.lara;

import java.io.IOException;
import java.io.PrintStream;

public class M22
{

	 public static void main(String[] args) throws IOException
	 {
		PrintStream p1 = System.out;
	    PrintStream p2 =new PrintStream("test3.log");
	 	System.out.println(1);//c
	 	p1.println(2);//c
	 	p2.println(3);//f
	 	System.setOut(p2);
	 	System.out.println(4);//f
	 	p1.println(5);//c
	 	p2.println(6);//f
	 	System.setOut(p1);
	 	System.out.println(7);//c
	 	p1.println(8);//c
	 	p2.println(9);//f
	 	
	 }
}
//c means console ,f means filesystem