/*

    A
   A B
  A B C
 A B C D
A B C D E
 B C D E
  C D E
   D E
    E

*/



class Q80
{
	public static void main(String[] args) 
	{  
		for (int i=1;i<=5 ;i++)
		{
			for (int j=i;j <= 4 ;j++)   
			{
				 System.out.print(" ");
			}
			char a='A';
			for (int j=1;j<=i ;j++,a++)   
			{
				 System.out.print(a + " ");
			}
          System.out.println();
		}
		for (char i='B';i<='E' ;i++)
		{
			
			for (char j='B';j <= i ;j++)   
			{
				 System.out.print(" ");
			}
			for (char j=i;j<='E' ;j++)   
			{
				 System.out.print(j + " ");
			}
          System.out.println();
		}
	}
}
