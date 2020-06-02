//4. WAP find out length of the string without length() method of a string?

import java.util.Scanner;
class Q5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s1 = sc.next();
		//hello
		int length = (s1 + 't').lastIndexOf('t');
		System.out.println("given string:" + s1);
		System.out.println("length:" + length);
	}
	
}