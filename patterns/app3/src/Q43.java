/*
    0
   101
  21012
 3210123
432101234
*/



class Q43
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=(5-i) ;j++ )
			{
				System.out.print(" ");
			}
			for (int k=1,l=(i-1);k<=((2*i)-1) ;k++)   
			{
				if(k<i)
				{
				   System.out.print(l--);
				}
				else
			    {
				   System.out.print(l++);
				}
			}
          System.out.println();
		}
	}
}
