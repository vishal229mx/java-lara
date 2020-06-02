//26. Develop a program to print sum of initial 30 prime numbers?
class  Q26
{
	public static void main(String[] args) 
	{
		int count = 1,sum = 0;
		outer:
		for(int i = 1; count <= 30  ; i++ )
		{
			for (int j = 2; j <= i/2 ; j++ )
		    {
				if (i%j == 0)
				{
					continue outer;
				}
		    }
				sum = sum + i;
				count++;
		}
		System.out.println("sum of first 30 prime no. is: " + sum);
	}
}
