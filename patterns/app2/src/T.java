//Q29.
/*
	*****
	 ****
	  ***
	   **
		*
*/
class T
{
	public static void main(String[] args) 
	{ 
		for(int i=1 ;i<=5;i++)
		{
			for(int j=i-1;j>=1;j--)
			{
               System.out.print(" ");
			}
			for (int k=5;k>=i ;k-- )
			{
				 System.out.print("*");
			}
			System.out.println();
		}
	}
}
