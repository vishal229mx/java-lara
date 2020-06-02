package com.lara;

import java.io.File;
import java.util.Scanner;

public class M6 {
	public class M5 {
		public void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("please enter dirctory name");
			String dir = sc.next();
			File f1 = new File(dir);
			File[] members = f1.listFiles();
			for(File member : members)
			{
				System.out.println(member.getName()+ ":" + member.isDirectory());
			}
		  }
		}


}
