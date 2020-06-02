package com.lara;

import java.io.File;
import java.util.Scanner;

public class M7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter dirctory name");
		String dir = sc.next();
		File f1 = new File(dir);
		print(f1);
	}
	static void print(File dir)
	{
		File[] members = dir.listFiles();
		System.out.println("members of"+ dir.getName());
		for(File member:members)
		{
			if (member.isFile()) {
				System.out.println(member.getName());
				
			}
			else
			{
				print(member);
			}
		}
	}

}
