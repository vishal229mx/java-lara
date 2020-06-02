// 33 develop a program to print  number which should come 
// after 3 non prime numbers. develop between 10 to 100
class  Q33
{
	public static void main(String[] args) 
	{
		boolean isPrime = true;
		int nonPrimeCount = 0;                                                                                                                                                                                                                                                                                                                                                        
		for(int i =10; i<=100;i++)
		{
			for (int j = 2;j<=(i/2) ;j++ )
			{
				if (i % j == 0)
				{
					nonPrimeCount ++;
					isPrime = false;
					break;
				}
			}
			if (nonPrimeCount == 3)
			{
				 System.out.print((i + 1) + ", ");
				 nonPrimeCount ++;
			}
			if (isPrime)
			{
				nonPrimeCount = 0;
				 
			}
			isPrime = true;
		}
	}
	
}