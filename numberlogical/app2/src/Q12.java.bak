//12. Find out whether digits are in rising ouder or not in a given number?
// ex1 12345 (yes)
// ex2 12745 (no)
// ex3 368 (yes)
// ex4 361 (no)
class  Q12
{
	static int k;
	public static void main(String[] args) 
	{
		if (args.length < 1)
		{
            System.out.println("please pass 1 cmd arg");
			return;
		}
		int num = Integer.parseInt(args[0]);
		boolean isRaisingOrder = true;
		//num = 12345
		int i = num, currentDigit, prevDigit = num % 10;
		i = i / 10;
		while (i != 0)
		{
			currentDigit = i % 10;
			if (prevDigit < currentDigit)
			{
				isRaisingOrder = false;
				break;
			}
			prevDigit = currentDigit;
			i = i / 10;
		}
         System.out.println("is digits of " + num + "are in RisingOrder: " + isRaisingOrder);
	}
}

/*
		if (args.length < 2)
		{
            System.out.println("please pass 2 or more than two cmd arg");
			return;
		}

		for (int i = 0;i<= args.length - 1; i ++)
		{
           for (int j = 1;i<= args.length; i ++)
		   {
			   if (args[i] < args[j])
			   {
                   k = 1;
			   }
			   else
			   {
				   k =2;
				   break;
		       }
		   }
		}
		if ( k == 1 )
		{
			System.out.println("yes");
		}
         else
		{
			System.out.println("no");
		}
		*/