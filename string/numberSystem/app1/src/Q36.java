//34 print  Fibonacci series from 100 to 10000 
class Q36  
{
	public static void main(String[] args) 
	{
		int num1 = 0;
		int num2= 1;
		int newNum;
		while ((num1 + num2) < 10000)
		{
			newNum = num1 + num2;
			if(newNum > 100)
			{
			System.out.print(newNum + ", ");
			}
			num1 = num2;
			num2 = newNum;
		}
	}
}
