/*
    A
   ABA
  ABCAB
 ABCDABC
ABCDEABCD
*/



class Q46
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=(5-i) ;j++ )
			{
				System.out.print(" ");
			}
			char c1 = 'A';
			for (int k=1;k<=((2*i)-1) ;k++)   
			{
				   System.out.print(c1++);
				if( k == i)
			    {
				   c1 = 'A';
				}
			}
          System.out.println();
		}
	}
}
