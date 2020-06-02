/*

    A
   B B
  C C C
 D D D D
E E E E E
 D D D D
  C C C
   B B
    A

*/



class Q79
{
	public static void main(String[] args) 
	{  
		char a='A';
		for (int i=1;i<=5 ;i++,a++)
		{
			for (int j=i;j <= 4 ;j++)   
			{
				 System.out.print(" ");
			}
			for (int j=1;j<=i ;j++)   
			{
				 System.out.print(a + " ");
			}
          System.out.println();
		}
		a='D';
		for (int i=2;i<=5 ;i++,a--)
		{
			for (int j=1;j < i ;j++)   
			{
				 System.out.print(" ");
			}
			for (int j=i;j<=5 ;j++)   
			{
				 System.out.print(a + " ");
			}
          System.out.println();
		}
	}
}
