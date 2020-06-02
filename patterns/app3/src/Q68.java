/*

    A
   A B
  A B C
 A B C D
A B C D E

*/



class Q68
{
	public static void main(String[] args) 
	{  
		for (int i=1;i<=5 ;i++)
		{
			for (int j=i;j<=4 ;j++)   
			{
				 System.out.print(" ");
			}
			char a='A';
			for (int j=1;j<=i ;j++,a++)   
			{
				 System.out.print( a + " " );
			}
          System.out.println();
		}
	}
}
