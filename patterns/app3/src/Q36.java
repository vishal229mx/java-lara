/*
    1
   333
  55555
 7777777
999999999
*/



class Q36 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=i;j<=4 ;j++ )
			{
				System.out.print(" ");
			}
     		for (int k=1;k<=((2*i)-1) ;k++ )   
			{
				System.out.print(((2*i)-1));
			}
          System.out.println();
		}
	}
}
