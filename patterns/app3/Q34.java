/*
     *
	***
   *****
  *******
 *********

*/



class Q34 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=i;j<=4 ;j++ )
			{
				System.out.print(" ");
			}
     		for (int k=1;k<=1 ;k++ )
			{
				System.out.print("*");
			}
			for (int l=k;l<i;l++ )
			{
				System.out.println("**");
			}
          System.out.println();
		}
	}
}
