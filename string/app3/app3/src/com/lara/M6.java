package com.lara;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M6 {
	public static void main(String[] args) throws IOException
    {
		File f1 = new File("test.txt");
		FileReader fin = new FileReader(f1);//reading you have spacified a new file
		BufferedReader bin = new BufferedReader(fin);
		/*String s1 = bin.readLine();
		
		while((s1 = bin.readLine()) != null)
		{
			System.out.println(s1);
			s1= bin.readLine();
		}
		*/
		String s1;
		while((s1 = bin.readLine()) != null)
		{
			System.out.println(s1);
		}
	}
		
}
//bufferdreader should be top on FileReader this is a best way to develop a program
//