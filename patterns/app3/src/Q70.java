/*

5 5 5 5 5
 4 4 4 4
  3 3 3
   2 2
    1

*/



class Q70
{
	public static void main(String[] args) 
	{  
		for (int i=1,k=5;i<=5 ;i++,k--)
		{
			for (int j=1;j < i ;j++)   
			{
				 System.out.print(" ");
			}
			for (int j=i;j<=5 ;j++)   
			{
				 System.out.print( k + " " );
			}
          System.out.println();
		}
	}
}
