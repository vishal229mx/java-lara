/*

    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

*/



class Q65
{
	public static void main(String[] args) 
	{  
		for (int i=1;i<=5 ;i++)
		{
			for (int j=i;j<=4 ;j++)   
			{
				 System.out.print(" ");
			}
			for (int j=i;j>=1 ;j--)   
			{
				 System.out.print( i + " " );
			}
          System.out.println();
		}
	}
}
