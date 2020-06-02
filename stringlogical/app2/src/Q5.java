//5. Find out length of the string wihtout length() method of a string?
import java.util.Scanner;
class  Q5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.next();
		int length = (s1 + 't').lastIndexOf('t');//lastIndexOf() is used to calculate the last index value
        System.out.println("Given String: " + s1);
        System.out.println("length: " + length);
	}
}
