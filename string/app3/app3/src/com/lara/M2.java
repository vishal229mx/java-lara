package com.lara;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M2 {
	 public static void main(String[] args) throws IOException
	   {
		File f1 = new File("test3.txt"); 
		FileWriter fout = new FileWriter("test4.txt", true);//while creating file writer we creating a reference of the file
		BufferedWriter bout = new BufferedWriter(fout);//Wherever you wanted you call new line you will be getting ultimate performance
		bout.write("Hello to all");
		bout.write("Hello  to all");
		bout.newLine();
		bout.write("Hello to all");
		bout.write("Hello to all");
		bout.flush();
		bout.close();
		fout.close();
		
		System.out.println("done");
	   }
}
//first close the buffer writer than close the file writer
//true and false is appended statement
// should be only on time performable threough last string
//the last resource flusing flush we can use only one time we cannot use flush to time
//the file code always required try carch or throws IOException is mandatoryt without that will be not working