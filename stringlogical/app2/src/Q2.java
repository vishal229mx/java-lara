//2. Write a program to reverse a String with recursive algorithm?
import java.util.Scanner;
class Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		String s2 = reverse(s1);
		System.out.println("Given String: " + s1);
		System.out.println("Reversed String: " + s2);
	}
	private static String  reverse(String s1)
	{
		//System.out.println("from reverse: " + s1);
		if(s1.length() == 0)
		{
			return "";
		}
		return s1.charAt(s1.length() -1) + 
			   reverse(s1.substring(0,s1.length() - 1));
	}
}
