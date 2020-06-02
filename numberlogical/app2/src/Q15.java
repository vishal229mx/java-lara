//15.Find out sum of all digits of a given number? 
class Q15
{
	public static void main(String[] args) 
	{
		if (args.length < 1)
		{
			System.out.println("pls pass 1 cla");
			return;
		}
		int i = Integer.parseInt(args[0]);
	    int	num = i;
		int sum = 0;
		while (i != 0)
		{
			  int x = i%10;
			  sum = sum + x ;
		      i = i/10;
		}
		System.out.println("sum of: " + num + " is " + sum);
	}
}
