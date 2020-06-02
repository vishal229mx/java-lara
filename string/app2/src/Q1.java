//1 write a program to reverse a string

import java.util.Scanner;
class Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter something");
		String s1 = sc.next();
		char[] chars = s1.toCharArray();
		char temp;
		for (int i = 0;i< (chars.length /2) ; i++ )
		{
			temp = chars[i];
			chars[i] = chars[chars.length - i  -1];
			chars[chars.length - i  -1] = temp;
		}
		String s2 =new String(chars);
		System.out.println("given string:" + s1);
		System.out.println("reverse string:" + s2);
		
	}
}
