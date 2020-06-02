// 20. find out a factorial value of a given number
class  Q20
{
	public static void main(String[] args) 
	{
		if (args.length < 1)
		{
			System.out.println("pls supply one command line int ars");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int num= i;
		int fact = 1;
		for (int j = 1;j<=i ;j++)
		{
			fact = fact*j;
		}
		System.out.println(fact);
	}
}
