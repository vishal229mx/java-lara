/*
1234567
 12345
  123
   1
*/



class Q50
{
	public static void main(String[] args) 
	{   
		for (int i=1;i<=4 ;i++)
		{
			for (int j=1;j<=(i-1) ;j++ )
			{
				System.out.print(" ");
			}
			for (int k=7,a=1;k>=((2*i)-1) ;k--, a += 1)   
			{
				   System.out.print(a);
			}
          System.out.println();
		}
	}
}
