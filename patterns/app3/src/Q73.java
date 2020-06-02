/*

E D C B A
 D C B A
  C B A
   B A
    A

*/



class Q73
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
			for (char j=k;j>='A' ;j--)   
			{
				 System.out.print(j + " ");
			}
          System.out.println();
		}
	}
}
