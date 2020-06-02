/*
    A
   CCC
  EEEEE
 GGGGGGG
IIIIIIIII
*/



class Q38
{
	public static void main(String[] args) 
	{
		char c1 = 'A';
		for (char i='A';i<=69 ;i++, c1 +=2 )
		{
			for (int j=i;j<=68 ;j++ )
			{
				System.out.print(" ");
			}
     		for (int k=65;k<=((2*i)-65) ;k++ )   
			{
				System.out.print(c1);
			}
          System.out.println();
		}
	}
}
