// 35. Print initial 10 numbers from the Fibonacci series
class  Q35
{
	public static void main(String[] args) 
	{
		
		int num1 = 0, num2 =1 ,count = 2;
		int newNum;
       System.out.print(num1 + ", " + num2 + ", ");
	   while (count < 10)
	   {
		   newNum = num1 + num2;
		   System.out.print(newNum + ", ");
		   num1 = num2;
		   num2 = newNum;
		   count++;
	   }
	}
}
