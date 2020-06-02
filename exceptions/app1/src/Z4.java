import java.util.Scanner;
class Z4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter something");
		String s1 = sc.next();
		try
		{
        
			System.out.println(1);
			int i = Integer.parseInt(s1);
			System.out.println(2);
			int k = i / (i - 9);
			System.out.println(3);
		}
		catch (ArithmeticException ex)    //one try can have any no. of catch
		{
			System.out.println(4);
		}
		catch (NumberFormatException ex)
		{
			System.out.println(5);
		}
		System.out.println("main end"); 
	}
}