// 37. Print Fibonacci series in reverse order from 5000 to 500
class  Q37
{
	public static void main(String[] args) 
	{
		int num1 = 0, num2 =1 ;
		int newNum;
	    while ((num1 + num2) < 5000)
	    {
		   newNum = num1 + num2;
		   num1 = num2;
		   num2 = newNum;
	    }
	      System.out.print(num2 + ", " + num1 + ", ");
		  int prevNum;
		  while((num2 - num1 ) > 500)
		  {
			  prevNum = num2 - num1;
			  System.out.print(prevNum + ", ");
              num2 = num1;
			  num1 = prevNum;
		  }
	}
}
