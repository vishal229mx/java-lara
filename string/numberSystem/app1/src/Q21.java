//find out given number is a prime or not?
class  Q21
{
	public static void main(String[] args) 
	{
		if (args.length < 1)
		{
			System.out.println("pls supply one command line int ars");
			return;
		}
		int num1 = Integer.parseInt(args[0]);
		boolean isPrime = true;
		for (int i =2;i<=(num1 / 2) ;i++ )
		{
		   if (num1 % i == 0)
		   {
			  isPrime = false;
			  break;
		   }
	}
		if (isPrime)
		{
			System.out.println(num1 + " is prime number");
		}
		else
		{
		  System.out.println(num1 + " is not prime number");
		}
	}
}
