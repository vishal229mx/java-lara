class Q43A 
{
	public static void main(String[] args) 
	{
		if (args.length<1)
		{
			System.out.println("enter something");
			return;
		}
		int num= Integer.parseInt(args[0]);
		int sum=0;
		for (int i=1;i<=(num/2) ;i++ )
		{
			if (num%i == 0)
			{
				sum += i;
			}
		}
		if (num== sum)
		{
         System.out.println("perfact");
		}
		else
		{
		System.out.println("number is not");
		}
	}
}
