/*
7777777
 55555
  333
   1

*/



class Q49
{
	public static void main(String[] args) 
	{   
		for (int i=1,a=7;i<=4 ;i++,a -= 2)
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
