// 38. Print immediate next number in the Fibonacci series?
class  Q38
{
	public static void main(String[] args) 
	{
		
		int num1 = 0, num2 =1 ;
		int newNum;
		System.out.print((num1 + 1) + ", " + (num2 +1) + ", ");
	   while ((num1 + num2) < 5000)
	   {
		   newNum = num1 + num2;
		   System.out.print((newNum + 1) + ", ");
		   num1 = num2;
		   num2 = newNum;
	   }
	}
}
