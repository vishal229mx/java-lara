/*
    1
   121
  12321
 1234321
123454321
*/



class Q45
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=(5-i) ;j++ )
			{
				System.out.print(" ");
			}
			for (int k=1,l=1;k<=((2*i)-1) ;k++)   
			{
				if(k<i)
				{
				   System.out.print(l++);
				}
				else
			    {
				   System.out.print(l--);
				}
			}
          System.out.println();
		}
	}
}
