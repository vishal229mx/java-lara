import java.util.Scanner;
class  Z2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter something");
		String s1 = sc.nextLine();
		System.out.println("serch string");
		char c1 = sc.next().charAt(0);
		char count = 0;
		for (int i=0;i<s1.length() ;i++ )
		{
			if (s1.charAt(i)==c1)
			{
				count ++;
			}
			System.out.println(count);
		}

	}
}
