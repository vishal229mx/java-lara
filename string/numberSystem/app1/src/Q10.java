//10. print all even number between two given number sum?
class  Q10
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
		int sum = 0;
		for (int k = i; k<=j ;k++ )
		{
		   if(k % 2 == 0)
		   {
             sum += k;
		   }
	}
	System.out.print("total sum :" + sum);
	}
}
