package com.lara;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class M9
{
  public static void main(String[] args) 
  {
	  File src = new File("C:\\Users\\win 10\\Pictures\\image1.jpg");
	  File target = new File("hello.jpg");
	  
	  try(FileInputStream fin = new FileInputStream(src);
		  BufferedInputStream bin = new BufferedInputStream(fin);
		  FileOutputStream fout = new FileOutputStream(target);
		  BufferedOutputStream bout = new BufferedOutputStream(fout))
	  {
		  byte[] bytes = new byte[(int) src.length()];
		  bin.read(bytes);
		  bout.write(bytes);
	  }
	  catch(IOException ex)
	  {
		  ex.printStackTrace();
	  }
  }
}
//object state writing into the file system reading back  to the memory, called as serialization