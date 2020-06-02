class Q2 
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
		int rev =0, rem;
		while(i != 0)
		{
		   rem = num%10;
		   rev = rev * 10 + rem;
		   i = i/10;
		}
		if (i == rev)
		{
			System.out.println("number is palindrom");
		}
		else
		{
			System.out.println("number is palindrom");
		}
		System.out.println(rev);
	}
}
