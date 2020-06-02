// 43 find out given number is a perfact  number or not?
class  Q43
{
	public static void main(String[] args) 
	{
		if (args.length < 1)
		{
			System.out.println("supply one cla");
			return;
		}
		int num = Integer.parseInt(args[0]);
		int sum = 0;
	    for (int i =1;i<=(num / 2) ;i++ )
	    {
			if (num % i == 0)
			{
				 sum += i;
			}
	    }
		if (num == sum)
		{
			System.out.println(num + "is a perfact number");
		}
		else
		{
			System.out.println(num + "is not a perfact number");
		}
	}
}
