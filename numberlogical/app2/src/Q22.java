//22. Develop a program to print initial 20 prime numbers?
class  Q22
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("pls supply 1 value in cla");
			return;
		}
		int num = Integer.parseInt(args[0]);
		outer:
		for (int i = 2; i <= num ; i++ )
		{
			for (int j = 2; j <= i/2 ; j++ )
		    {
				if (i%j == 0)
				{
					continue outer;
				}
		    }
          System.out.print( i + ",");
		}
	}
}
