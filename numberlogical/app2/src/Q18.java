//18.Assume total number of digits in a given number is even?
//   Reverse only first half of the given number
class Q18
{
	public static void main(String[] args) 
	{
		if (args.length < 1)
		{
			System.out.println("pls pass 1 cla");
			return;
		}
		int i = Integer.parseInt(args[0]);
	    int	num = i, var =0,rev=0;
		int inc = 1;
		int count1 =1 ,count2 =1;
		while (i != 0)
		{
			count1 ++;
		      i /= 10;
		}
		while (num != 0)
		{
		   int half = count1 / 2;//3
		   if (count2 <= half)
		   {	   
			   int x = num % 10;
			   var = inc * x + var ;
			   inc = inc * 10;
		   }
		   else
		   {
              int x = num % 10; 
              rev = rev * 10 + x;
		   }
		     num /= 10;
		     count2++;    		    
		}
	   System.out.println(rev+""+var);
    }
}
