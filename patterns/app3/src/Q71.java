/*

5 4 3 2 1
 4 3 2 1
  3 2 1
   2 1
    1

*/



class Q71
{
	public static void main(String[] args) 
	{  
		for (int i=1,k=5;i<=5 ;i++,k--)
		{
			for (int j=1;j < i ;j++)   
			{
				 System.out.print(" ");
			}
			for (int j=k;j>=1 ;j--)   
			{
				 System.out.print( j + " " );
			}
          System.out.println();
		}
	}
}
