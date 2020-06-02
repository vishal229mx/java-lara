//13.Swap two int variables without 3rd variable? 
class Q13
{
	public static void main(String[] args) 
	{
		if (args.length < 2)
		{
			System.out.println("pls pass 2 cla");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		System.out.println( i + ", " + j);
		i = i + j;
		j = i - j;
		i = i - j;
		System.out.println( i + ", " + j);
	}
}
