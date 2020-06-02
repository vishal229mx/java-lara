package com.lara;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//run command src/com/lara/hello.java
//comment remove
public class M8 {
       public static void main(String[] args) throws IOException {
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("enter file name");
    	   String fileName = sc.next();
    	   FileReader fin = new FileReader(fileName);
    	   BufferedReader bin = new BufferedReader(fin);
    	   StringBuffer sb = new StringBuffer();
    	   String line = bin.readLine();
    	   boolean commentsStarted = false;
    	   while(line != null)
    	   {
    		   if (line.trim().startsWith("/*")) 
    		   {
				  commentsStarted = true;
			   }
    		   if (!(line.trim().startsWith("//")|| commentsStarted)) 
    		   {
    			   sb.append(line + "\n");
			   }
    		   if (line.endsWith("*/"))
    		   {
				  commentsStarted= false;
			   }
    		   line = bin.readLine();
    	   }
    	   File f1 = new File("src/com/lara/Hello.java");
    	   FileWriter out = new FileWriter(f1);
    	   BufferedWriter bout = new BufferedWriter(out);
    	   bout.write(sb.toString());
    	   bout.flush();
    	   bout.close();
    	  System.out.println("done");

	}
}
