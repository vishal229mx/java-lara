//39 print  all prime number only from the fibonacci series?
//continue till to 5000
class Q39  
{
	public static void main(String[] args) 
	{
		int num1 = 0;
		int num2= 1;
		int newNum;
		while ((num1 + num2) < 5000)
		{
			newNum = num1 + num2;
			boolean isPrime = true;
			for (int i = 2;i<= newNum / 2 ;i++ )
			{
				if (newNum % i == 0)
				{
					isPrime = false;
					break;
				}
			}
			if (isPrime)
			{
				System.out.print(newNum + ", ");
			}
			num1 = num2;
			num2 = newNum;
		}
		
	}
}
