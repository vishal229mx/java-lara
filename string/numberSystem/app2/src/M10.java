//10. print all even number between two given number?
class M10 
{
	public static void main(String[] args) 
	{
		if (args.length < 2)
		{
			System.out.println("enter two cla");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int sum =0;
		for (int k =i;k<j ;k++ )
		{
			if (k%2==0)
			{
              System.out.print(k + ",");
			}
		}
	}
}
