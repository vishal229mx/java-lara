/*
    A
   BBB
  CCCCC
 DDDDDDD
EEEEEEEEE
*/



class Q37
{
	public static void main(String[] args) 
	{
		for (char i='A';i<=69 ;i++ )
		{
			for (int j=i;j<=68 ;j++ )
			{
				System.out.print(" ");
			}
     		for (int k=65;k<=((2*i)-65) ;k++ )   
			{
				System.out.print(i);
			}
          System.out.println();
		}
	}
}
