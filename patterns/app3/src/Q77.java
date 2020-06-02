/*

    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5

*/



class Q77
{
	public static void main(String[] args) 
	{  
		for (int i=1;i<=5 ;i++)
		{
			for (int j=i;j <= 4 ;j++)   
			{
				 System.out.print(" ");
			}
			for (int j=1;j<=i ;j++)   
			{
				 System.out.print(j + " ");
			}
          System.out.println();
		}
		
		for (int i=2;i<=5 ;i++)
		{
			for (int j=1;j < i ;j++)   
			{
				 System.out.print(" ");
			}
			for (int j=i;j<=5 ;j++)   
			{
				 System.out.print(j + " ");
			}
          System.out.println();
		}
	}
}
