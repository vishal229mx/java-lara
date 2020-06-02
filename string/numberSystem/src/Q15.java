//15 find out sum digit of given number?
class Q15
{
	public static void main(String[] args) 
	{
		if (args.length ==0)
		{
			System.out.println("pls supply one command line int ars");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int sum = 0, digit;
		while (i !=0)
		{
			digit = i % 10;
			sum = sum + digit;
			i = i/10; 
		}
		System.out.println(sum);
	}
}
