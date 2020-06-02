//Q25.
/*
	    1
	   22
	  333
	 4444
	55555
*/
class P
{
	public static void main(String[] args) 
	{ 
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=4;j++)
			{
               System.out.print(" ");
			}
			for (int k=1;k<=i ;k++ )
			{
				 System.out.print(i);
			}
			System.out.println();
		}
	}
}
