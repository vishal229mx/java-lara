//22. develop a program to print intial 20 prime number?
class Q22 
{
	public static void main(String[] args) 
	{
		if (args.length < 1)
		{
			System.out.println("pls supply one command line int ars");
			return;
		}
		int num1 = Integer.parseInt(args[0]);
		outer:
		for (int i =2;i<=num1 ;i++ )
		{
		  for ( int j = 2;j<i-1 ;j++ )
		  {
            if (i%j == 0)
		    {
			  continue outer;
		    }
		  }
		  System.out.print(i + ",");
	    }
	}
}