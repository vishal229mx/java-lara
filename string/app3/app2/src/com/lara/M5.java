package com.lara;

import java.io.File;
import java.util.Arrays;
public class M5 {
public static void main(String[] args) {
	File f1 = new File("D:\\JDK8.0");
	File[] members = f1.listFiles();
	for(File member : members)
	{
		System.out.println(member.getName()+ ":" + member.isDirectory());
	}
  }
}

