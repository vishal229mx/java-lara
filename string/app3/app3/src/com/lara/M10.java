package com.lara;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class M10
{
  public static void main(String[] args) throws IOException
{
    Address add = new Address();
    add.streetName = "BTM";
    
	Person p1 = new Person();
	p1.age= 25;
	p1.weight = 57.5;
	p1.address = add;//address it is not a serilizable type
	
	FileOutputStream fout = new FileOutputStream("person.txt");
	ObjectOutputStream out = new ObjectOutputStream(fout);
	out.writeObject(p1);
	out.flush();
	out.close();
	System.out.println("done");
	
 }
}
//we are serializing a person object address object serializing
//state is nothing but attribute value state is object
//by default object can not be serialize the object, in order to serialize the object, class should be a type of serilizeable
//serilizable is the marker interface it is only for providing a mark no matter is member there or not