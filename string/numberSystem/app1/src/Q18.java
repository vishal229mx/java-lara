//18 find out given number is palindrom?
class Q18
{
	public static void main(String[] args) 
	{
		if (args.length < 1)
		{
			System.out.println("pls supply one command line int ars");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int num = i;
		int rev = 0;
		while (i != 0)
		{
			int x = i % 10;
			rev = rev * 10 + x;
			i = i/10;
		}
		if (num == rev)
		{
			System.out.println("number is palindrom:"+ num);
		}
		else
		{
			System.out.println("number is not palindrom:"+ num);
		}
		System.out.println("reverse of: "+ num + "is: " + rev);

	}
}

