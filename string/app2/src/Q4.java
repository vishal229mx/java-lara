//4. WAP to rotate one char in a given string
//Right Rotate
import java.util.Scanner;
class Q4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter something");
		String s1 = sc.next();                //for reading all the element of a line
		String s2 = s1.charAt(s1.length()-1) + s1.substring(0, s1.length() - 1);
		System.out.println("given string:" + s1);
		System.out.println("Right rotate by one:" + s2);
	}
}