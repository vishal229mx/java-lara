/*
    A
   BAB
  CBABC
 DCBABCD
EDCBABCDE
*/



class Q44
{
	public static void main(String[] args) 
	{
		char c1 = 'A';
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=(5-i) ;j++ )
			{
				System.out.print(" ");
			}
			char c2 = c1++;
			for (int k=1;k<=((2*i)-1) ;k++)   
			{
				if(k<i)
				{
				   System.out.print(c2--);
				}
				else
			    {
				   System.out.print(c2++);
				}
			}
          System.out.println();
		}
	}
}
