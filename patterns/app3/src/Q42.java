/*
    A
   CBA
  EDCBA
 GFEDCBA
IHGFEDCBA
*/



class Q42
{
	public static void main(String[] args) 
	{
		char c1 = 'A'-2;
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=(5-i) ;j++ )
			{
				System.out.print(" ");
			}
			c1 += 2 ;
			char c2=c1;
     		for (int k=1;k<=((2*i)-1) ;k++,c2-- )   
			{
				System.out.print(c2);
			}
          System.out.println();
		}
	}
}
