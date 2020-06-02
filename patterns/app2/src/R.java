//Q27.
/*
	    A
	   BB
	  CCC
	 DDDD
	EEEEE
*/
class R
{
	public static void main(String[] args) 
	{ 
		for(char i='A';i<='E';i++)
		{
			for(int j=i;j<=68;j++)
			{
               System.out.print(" ");
			}
			for (char k='A';k<=i ;k++ )
			{
				 System.out.print(i);
			}
			System.out.println();
		}
	}
}
