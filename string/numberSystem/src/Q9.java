//9. print all odd number between two given number?
class  Q9
{
	public static void main(String[] args) 
	{
		if (args.length < 2)
		{
			System.out.println("please supply 2 cla");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		for (int k = i; k<=j ;k++ )
		{
		if(k % 2 != 0)
		{
          System.out.print(k + ", ");
		}
	}
	}
}
