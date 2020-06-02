/*

D
CD
BCD
ABCD
BCD
CD
D

*/



class Q58
{
	public static void main(String[] args) 
	{   char a;
		for (char i='D';i>='B' ;i--)
		{
			for (char j=i;j<='D' ;j++)   
			{
				   System.out.print(j);
			}
          System.out.println();
		}
		
		for (char i='A';i<='D' ;i++)
		{
			for (char j=i;j<='D' ;j++)   
			{
				   System.out.print(j);
			}
          System.out.println();
		}
	}
}
