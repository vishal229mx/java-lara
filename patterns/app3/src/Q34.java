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
     		for (int k=1;k<=1 ;k++ )  //k<= ((2*i)-1)
			{
				System.out.print(1);
			}
			for (int l=1;l<i;l++ )
			{
				System.out.print(i + i);
			}
          System.out.println();
		}
	}
}
