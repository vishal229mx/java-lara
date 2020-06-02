/*
4444444
 33333
  222
   1

*/



class Q48
{
	public static void main(String[] args) 
	{   
		for (int i=1,a=4;i<=4 ;i++,a--)
		{
			for (int j=1;j<=(i-1) ;j++ )
			{
				System.out.print(" ");
			}
			for (int k=7;k>=((2*i)-1) ;k--)   
			{
				   System.out.print(a);
			}
          System.out.println();
		}
	}
}
