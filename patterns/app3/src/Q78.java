/*

    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
 1 2 3 4
  1 2 3
   1 2
    1

*/



class Q78
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
			int k=1;
			for (int j=i;j<=5 ;j++,k++)   
			{
				 System.out.print(k + " ");
			}
          System.out.println();
		}
	}
}
