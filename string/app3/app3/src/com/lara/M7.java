package com.lara;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M7 {
   public static void main(String[] args)
   {
	 File f1 = new File("test1.txt");
	 FileReader fin = null;
	 BufferedReader bin = null;
	 try
	 {
		 fin = new FileReader(f1);
		 bin = new  BufferedReader(fin);
		 String s1;
		 while((s1= bin.readLine()) != null)
		 {
			 System.out.println(s1);
		 }
		 System.out.println("done");
	 }
	 catch(IOException ex)
	 {
		 ex.printStackTrace();
	 }
	 finally
	 {
		if (bin !=null)
			{
			  try
			  {
				 bin.close();
				 bin=null;
			 } 
			  catch (IOException ex)
			  {
				ex.printStackTrace();
			 }	
		}
		if (fin != null) 
		{
	       try 
	       {
			     fin.close();
			     fin=null;
		   }
	       catch (IOException ex)
	       {
			ex.printStackTrace();
		   }		
		}
	 }
   }
}
