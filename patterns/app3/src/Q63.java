/*

   D
  DC
 DCB
DCBA
 DCB
  DC
   D

*/



class Q63
{
	public static void main(String[] args) 
	{  
		for (int i=3;i>=1 ;i--)
		{
			for (int j=i;j>=1 ;j--)   
			{
				 System.out.print(" ");
			}
			char a = 'D';
			for (int j=i;j<=3 ;j++,a--)   
			{
				 System.out.print(a);
			}
          System.out.println();
		}
		
		for (int i=0;i<=3 ;i++)
		{
			for (int j=i;j>0 ;j--)   
			{
				 System.out.print(" ");
			}
			char a = 'D';
         	for (int j=i;j<=3 ;j++,a--)   
			{
				 System.out.print(a);
			}
          System.out.println();
		}
	}
}
