class M3 
{
	public static void main(String[] args) 
	{
		if (args.length < 3)
		{
			System.out.println("enter something");
			return;
		}
		int i= Integer.parseInt(args[0]);
		int j= Integer.parseInt(args[1]);
		int k= Integer.parseInt(args[2]);
		int sum = (i + j == k || j + k == i || i + k == j);
		System.out.println(sum);
	}
}
