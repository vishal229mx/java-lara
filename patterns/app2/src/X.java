//Q33.
/*
ABCDE
 ABCD
  ABC
   AB
    A
*/
class X
{
	public static void main(String[] args) 
	{ 
		for(char i='E' ;i>=65;i--)
		{
			for(int j=i;j<=68;j++)
			{
               System.out.print(" ");
			}
			for (char k=65;k<=i ;k++ )
			{
				 System.out.print(k);
			}
			System.out.println();
		}
	}
}
