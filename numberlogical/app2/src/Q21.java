//21. Develop a program to find out given number is a prime or not?
class  Q21
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("pls supply 1 value in cla");
			return;
		}
		boolean flag = false;
		int num = Integer.parseInt(args[0]);
		outer:
		for (int i = 2; i <= num ; i++ )
		{
			for (int j = 2; j <= i -1 ; j++ )
		    {
				if (i%j == 0)
				{
					continue outer;
				}
		    }
            if(num == i)
			{
			   flag = true;
			}
		}
		if(flag)
			{
			   System.out.println(num +"  is prime" );
            }
			else
            {
			   System.out.println(num +"  is not prime" );
            }
		
	}
}

/*
for (int i =2 ; i<= (num / 2); i++)
{
	if(num % i == 0)
	{
		isprime = false;
		break;
	}
}






*/
