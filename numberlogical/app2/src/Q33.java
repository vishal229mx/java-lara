//33. Develop a program to print 30 prime numbers which
//    comes after 3 non prime numbers. Develop between 10 to 100
class  Q33
{
	public static void main(String[] args) 
	{
		int count = 0;
		outer:
		for(int i = 10; i<=100 ; i++)
		{
			for (int j = 2; j <= i/2 ; j++ )
		    {
				if (i%j == 0)
				{
					count++;
				   continue outer;
				}
		    }
		    if (count == 3)
		    {
				System.out.print((i + 1) + ", ");
				count = 0;
		    }
			if(isPrime)
			{
				count = 0;
			}
			isPrime =true;

         }		
	}
}
