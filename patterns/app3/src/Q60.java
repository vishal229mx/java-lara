/*

   3
  32
 321
3210
 321
  32
   3

*/



class Q60
{
	public static void main(String[] args) 
	{  
		for (int i=3;i>=1 ;i--)
		{
			for (int j=i;j>=1 ;j--)   
			{
				 System.out.print(" ");
			}
			for (int j=3;j>=i ;j--)   
			{
				 System.out.print(j);
			}
          System.out.println();
		}
		
		for (int i=0;i<=3 ;i++)
		{
			for (int j=i;j>0 ;j--)   
			{
				 System.out.print(" ");
			}
         	for (int j=3;j>=i ;j--)   
			{
				 System.out.print(j);
			}
          System.out.println();
		}
	}
}
