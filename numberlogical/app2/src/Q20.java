//20. Find out factorial value for a given number?
class  Q20
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("pls supply 1 value in cla");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int num = i;
		int fact = 1;
		while (i != 0)
		{

           fact = fact * i;
		   i--;
		}
		System.out.println("factorial of " + num + " is " + fact);
	}
}
