//Q32.
/*
EEEEE
 DDDD
  CCC
   BB
    A
*/
class W
{
	public static void main(String[] args) 
	{ 
		for(char i='E' ;i>=65;i--)
		{
			for(int j=i;j<=68;j++)
			{
               System.out.print(" ");
			}
			for (int k=65;k<=i ;k++ )
			{
				 System.out.print(i);
			}
			System.out.println();
		}
	}
}
