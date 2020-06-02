package com.lara;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M5 {
    public static void main(String[] args) throws IOException
    {
		File f1 = new File("test.txt");
		FileReader fin = new FileReader(f1);//reading you have spacified a new file
		
		char[] data = new char[(int)f1.length()];
		//char[] data = new char[10];
		fin.read(data);
		String s1 = new String(data);
		System.out.println(s1);
	}
}
//length type return type is a long any array type is int that is why 
//it is narrowing into int  
//we dont required a flus and closing here flush is only for clear fully
//close is not mandatory but it is advisible to using close beacause in java we are 

//two limitation we have using buffer reader:
//no mathod to support reading the content line by by line
//here also no buffer using because of no buffer uses less performance.