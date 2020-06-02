//Q31.
/*
12345
 1234
  123
   12
    1
*/
class V
{
	public static void main(String[] args) 
	{ 
		for(int i=5 ;i>=1;i--)
		{
			for(int j=i;j<=4;j++)
			{
               System.out.print(" ");
			}
			for (int k=1;k<=i ;k++ )
			{
				 System.out.print(k);
			}
			System.out.println();
		}
	}
}
