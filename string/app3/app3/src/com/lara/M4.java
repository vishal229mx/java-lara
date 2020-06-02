package com.lara;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M4 {
    public static void main(String[] args)
    {
		File f1 = new File("test7.txt");//auto resource closing
		try (FileWriter out = new FileWriter(f1);
			BufferedWriter bout = new BufferedWriter(out))
		{
			bout.write("Hello to all");
			bout.write("Hello to all");
			bout.newLine();
			bout.write("Hello to all");
			bout.write("Hello to all");
			System.out.println("done");
		}
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
	}
}
