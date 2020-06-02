package com.lara;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Employee
{
	
	public static void main(String[] args) throws IOException
	 {
	 	
	 	FileInputStream fout = new FileInputStream("emp.txt");
	 	ObjectInputStream out = new ObjectInputStream(fout);
	 	Employee e1 =  (Employee) in.readObject();
	 	System.out.println(e1.age);
	 	System.out.println(e1.weight);
	 	System.out.println(e1.address.streetName);
	 	System.out.println(e1.email);
       	 	
	  }
}
