/*
ABCDEFG
 ABCDE
  ABC
   A
*/



class Q53
{
	public static void main(String[] args) 
	{   
		for (int i=1;i<=4 ;i++)
		{
			for (int j=1;j<=(i-1);j++ )
			{
				System.out.print(" ");
			}
			char a = 'A';
			for (int k=7;k>=((2*i)-1) ;k-- ,a++)   
			{
				   System.out.print(a);
			}
          System.out.println();
		}
	}
}
