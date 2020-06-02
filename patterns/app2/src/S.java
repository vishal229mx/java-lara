//Q28.
/*
	    A
	   AB
	  ABC
	 ABCD
	ABCDE
*/
class S
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
				 System.out.print(k);
			}
			System.out.println();
		}
	}
}
