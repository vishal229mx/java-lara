/*

       7
      6 6
     5   5
    4     4
   3       3
  2         2
 1           1

*/

class Pat5 
{
	public static void main(String[] args) 
	{
		for (int i=1,k=7;i<=7 ;i++,k-- ) //rows from 1 to 7 
		{
			for (int j=7;j>=i ;j-- ) //for left spaces
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i ;j++ ) //for printing values
			{
				if (i == j || j == 1) //conditions to print *  ...here if when j==1 and j==i happen then only print *
				{
                    System.out.print(k  + " ");//printing * and one space
				}
				else
				{
					System.out.print("  ");//here printing two white spaces for empty space
				}
			}
		System.out.println();
		}
	}
}
