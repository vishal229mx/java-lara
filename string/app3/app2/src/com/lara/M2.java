package com.lara;

import java.io.File;
import java.io.IOException;

public class M2 {
public static void main(String[] args) throws IOException {
	{
		File f1 = new File("hello.txt");
		System.out.println(f1.createNewFile());
	}
}
}
