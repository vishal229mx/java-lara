//Q17.
/*
	AAAAA
	BBBB
	CCC
	DD
	E
*/
class J
{
	public static void main(String[] args) 
	{ 
		for(char i='A';i<='E';i++)
		{
			for(char j='E';j>=i;j--)
			{
               System.out.print(i);
			}
			System.out.println();
		}
	}
}
