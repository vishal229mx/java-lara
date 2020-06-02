//4. WAP to rotate one char in a given string
//left rotate

import java.util.Scanner;
class Q4A 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter something");
		String s1 = sc.next();                //for reading all the element of a line
		String s2 = s1.substring(1, s1.length())+s1.charAt(0);
		System.out.println("given string:" + s1);
		System.out.println("left rotate by one:" + s2);
	}
	
}