/*

A B C D E
 A B C D
  A B C
   A B
    A

*/



class Q74
{
	public static void main(String[] args) 
	{  
		for (int i=1;i<=5 ;i++)
		{
			for (int j=1;j < i ;j++)   
			{
				 System.out.print(" ");
			}
			char k='A';
			for (int j=i;j<=5 ;j++,k++)   
			{
				 System.out.print(k + " ");
			}
          System.out.println();
		}
	}
}
