//14.Find out total digits of a given number? 
class Q14
{
	public static void main(String[] args) 
	{
		if (args.length < 1)
		{
			System.out.println("pls pass 1 cla");
			return;
		}
		int i = Integer.parseInt(args[0]);
		//int count = args[0].length();
		//System.out.println(count);
		int count = 0;
		while (i != 0)
		{
              i = i/10;
			  count++;
		}
		System.out.println(count);
	}
}
