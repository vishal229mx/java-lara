class  Q4
{
	public static void main(String[] args) 
	{
		if (args.length < 1)
		{
          System.out.println("enter number");
		}
		int i=Integer.parseInt(args[0]);
		int num = i;
		int temp =0;
		for (int j=2;j<=i-1 ;j++ )
		{
			if (i%j == 0)
			{
				temp = temp+1;
			}

		}
		if (temp == 0)
		{
			System.out.println("not");
		}
		else
		{
		  System.out.println("prime");
		}
	}
}
