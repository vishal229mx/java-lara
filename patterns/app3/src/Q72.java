/*

E E E E E
 D D D D
  C C C
   B B
    A

*/



class Q72
{
	public static void main(String[] args) 
	{  
		char k='E';
		for (int i=1;i<=5 ;i++,k--)
		{
			for (int j=1;j < i ;j++)   
			{
				 System.out.print(" ");
			}
			for (int j=i;j<=5 ;j++)   
			{
				 System.out.print(k + " ");
			}
          System.out.println();
		}
	}
}
