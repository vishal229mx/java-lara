// 39. Print all the prime numbers only from the Fibonacci series?
//     continue till to 5000
class  Q39
{
	public static void main(String[] args) 
	{
		
		int num1 = 0, num2 =1 ;
		int newNum;
		outer:
	    while ((num1 + num2) < 5000)
	    {
		   newNum = num1 + num2;
		   num1 = num2;
		   num2 = newNum;
		   for (int i = 2;i<=newNum/2 ; i++)
		   {
			   if(newNum % i == 0)
               continue outer;    
		   }
           System.out.print(newNum + ",  ");   
	    }
	}
}