/*

    *
   * *
  *   *
 *     *
*       *


*/

//i==j

class Q81
{

	
	public static void main(String[] args) 
	{

		/*
		int rows = 5;
		int cols = 9;
		for (int i=1;i <= rows ; i++)
		{
			for (int j=1;j <= cols ;j++ )
			{
				if (j != (rows + 1 -i) && j != (rows +i -1))
				{
					System.out.print(" ");
				}
				else
				{
                    System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

*/

		
		for (int i=1;i<=5 ;i++)
		{
			for (int j=i;j <= 4 ;j++)   
			{
				 System.out.print(" ");
			}
			for (int j=1;j<=i ;j++)   
			{

				if(i == j || j==1)
	            {
				 System.out.print("*" + " ");
                 }
				 else
				 {
				 System.out.print("  ");
                 }

				/* if( j==1 )
					 {
				 System.out.print("*" + " ");
                 }
				 else
				 {
				 System.out.print(" ");
                 }
				*/
				
			}
          System.out.println();
		}
		
	}
}

