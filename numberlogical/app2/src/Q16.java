//16.Reverse a  given number? 
class Q16
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
		int rev = 0;
		while (i != 0)
		{
			  int x = i % 10;
			  rev = rev *10 + x ;
		      i /= 10;
		}
		System.out.println("reverse of: " + num + " is " + rev);
	}
}
