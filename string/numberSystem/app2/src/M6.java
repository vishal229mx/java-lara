//7. find out given number is an even or odd
class M6 
{
	public static void main(String[] args) 
	{
		if (args.length < 1)
		{
			System.out.println("enter two argument");
			return;
		}
		int i = Integer.parseInt(args[0]);
		boolean iOdd = (i%2 == 0) ? false : true;
		if (iOdd)
		{
			System.out.println("number is odd");
		}
		else
		{
			System.out.println("number is even");
		}
	}
}
