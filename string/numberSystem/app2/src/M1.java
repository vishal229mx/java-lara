class M1 
{
	public static void main(String[] args) 
	{
		if (args.length < 2)
		{
			System.out.println("passing three argument");
			return ;
		}
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		//int max = i < j ? j:i;
		int min = i < j ? i:j;
		//System.out.println(max);
		System.out.println(min);
	}
}
