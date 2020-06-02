import java.util.Scanner;
class  Z1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter something");
		String s1 = sc.next();
		int length = (s1+'t').lastIndexOf('t');
		System.out.println("giving string"+s1);
		System.out.println("length"+length);
	}
}
