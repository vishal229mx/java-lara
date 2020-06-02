package com.lara;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class M12
{
	 public static void main(String[] args) throws IOException
	 {
	     Address add = new Address();
	     add.streetName = "BTM";
	     
	 	Employee e1 = new Employee();
	 	e1.age = 25;
	 	e1.weight = 57.5;
	 	e1.address = add;
	 	e1.email = "a@A.com";
	 	
	 	FileOutputStream fout = new FileOutputStream("emp.txt");
	 	ObjectOutputStream out = new ObjectOutputStream(fout);
	 	out.writeObject(e1);
	 	out.flush();
	 	out.close();
	 	System.out.println("done");
	 	
	  }
}
