/*
GGGGGGG
 EEEEE
  CCC
   A
*/



class Q52
{
	public static void main(String[] args) 
	{   
		char a='G';
		for (int i=1;i<=4 ;i++, a -= 2)
		{
			for (int j=1;j<=(i-1);j++ )
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
