/*

   D
  CD
 BCD
ABCD
 BCD
  CD
   D

*/



class Q62
{
	public static void main(String[] args) 
	{  
		for (char i='D';i<='B' ;i--)
		{
			for (char j=i;j>='B' ;j--)   
			{
				 System.out.print(" ");
			}
			for (int j=i;j<='D' ;j--)   
			{
				 System.out.print(i);
			}
          System.out.println();
		}
		
		for (chaR i=0;i<=3 ;i++)
		{
			for (int j=i;j>0 ;j--)   
			{
				 System.out.print(" ");
			}
         	for (int j=i;j<=3 ;j++)   
			{
				 System.out.print(j);
			}
          System.out.println();
		}
	}
}
