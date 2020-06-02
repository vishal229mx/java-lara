class B20A
{
	public static void main(String[] args) 
	{
		if (args.length ==0)
		{
			System.out.println("pls supply one command line int ars");
			return;
		}
		int num = 0;
		try
		{
			num = Integer.parseInt(args[0]);
		}
		catch (NumberFormatException ex)
		{
			System.out.println("pls supply only int args");
			return;
		}
		int sum = 0, digit;
		for (;num !=0 ;num = num/10 )
		{
			digit = num % 10;
			sum = sum + digit;
		}
		System.out.println(sum);
	
	}
}
