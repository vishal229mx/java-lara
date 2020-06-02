//5A. Find out length of the string wihtout length() method of a string?
//another solution 
import java.util.Scanner;
class  Q5A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.next();
		int length = s1.toCharArray().length;
        System.out.println("Given String: " + s1);
        System.out.println("length: " + length);
	}
}
