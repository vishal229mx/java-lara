//27. Develop a program to print sum of  prime numbers?
//    between two given numbers...
class  Q27
{
	public static void main(String[] args) 
	{
		if(args.length < 2)
		{
			System.out.println("pls supply 2 cla");
			return;
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int sum = 0;
		outer:
		for(int i = num1; i<=num2  ; i++ )
		{
			for (int j = 2; j <= i/2 ; j++ )
		    {
				if (i%j == 0)
				{
					continue outer;
				}
		    }
				sum = sum + i;
		}
		System.out.println("sum of prime no. between: " + num1 + " and " + num2 + " is " + sum);
	}
}
