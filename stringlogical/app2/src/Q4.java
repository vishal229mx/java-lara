//4. Write a program to rotate one char in a given String
//Right rotate by one
import java.util.Scanner;
class  Q4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.next();
		String s2 = s1.charAt(s1.length() - 1) + s1.substring(0, s1.length() - 1);
        System.out.println("Given String: " + s1);
        System.out.println("Right rotate by one: " + s2);
	}
}
