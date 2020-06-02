package com.lara;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M3 {
      public static void main(String[] args)
    {
		 File f1 = new File("test5.txt");
		 FileWriter fout = null;
		 BufferedWriter bout = null;
		 try 
		 {
			 fout = new FileWriter(f1);
			 bout = new BufferedWriter(fout);
			 bout.write("Hello to all");
			 bout.write("Hello to all");
			 bout.newLine();
			 bout.write("Hello to all");
			 bout.write("Hello to all");
		}
		 catch (IOException ex)
		 {
			ex.printStackTrace();
		 }
		 finally
		 {
			if (bout != null)
			{
			  try 
			  {
				  bout.flush();
				  bout.close();
				  bout=null;
			  } 
			  catch (IOException ex) 
			  {
				ex.printStackTrace();
			  }	
			}
			try 
			{
			   if (fout != null )
			   {
				 fout.close();
				 fout = null;
			   }	
			}
			catch (IOException ex) 
			{
				ex.printStackTrace();
			}
		}
		 System.out.println("done");
	}
}
