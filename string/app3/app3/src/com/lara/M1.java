package com.lara;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;


public class  M1
{
   public static void main(String[] args) throws IOException
   {
	File f1 = new File("test.txt"); 
	FileWriter fout = new FileWriter("test1.txt", true);//whwnever 
	fout.write("Hello to all");
	fout.write("Hello \n to all");
	fout.write("Hello to all");
	fout.write("Hello to all");
	fout.flush();//while writing flush in close both are mandatory then only data will be reflect
	fout.close();//flusing means forcebly every cherector go in the file
	System.out.println("done");
   }
}
//write method it is keep on writing only write like print no new no line by default appended status is false 
//always required a rrewritihng a orignal conetent content there is no
//it thata file is avialable then use thata file otherwise file writer craeate a new file
//you can spacify file name staright way in the from of string
//filewriter constructor argument you can spacify file name of a string
//if you want a new line write \n explicitly  there is no default


//if you using fileWriter two limitition:
//1. deficult to write the content line by line producing the predefined new line
//2  fileReader not using a buffer internaly beacuse of no buffer less performance