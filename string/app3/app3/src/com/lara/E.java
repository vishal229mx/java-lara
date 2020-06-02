package com.lara;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class E implements Serializable
{
  int i;
  //transient int j; 
  static int j;
  private void writeObject(ObjectOutputStream out) throws IOException, ClassNotFoundException
  {
	  System.out.println("from write object");
	  out.defaultWriteObject();
	  out.writeInt(j);
  }
  
  private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
  {
	  System.out.println("from read object");
	  in.defaultReadObject(); 
	  j=in.readInt();
	 // System.out.println(in.readInt());
  }
}
//this is customizing serialization while calling out.writeObject() it is calling 
//if you want to these two private method internally using serialization writeObject method and read Object method
//by degfault both transient and static not a part of the serilizaton