/*

 1
 3*2
 4*5*6
 10*9*8*7

*/


class Pat4 
{
	public static void main(String[] args) 
	{
		for (int i=1,k=1;i<=4 ;i++,k++ )
		{
			for (int j=1;j<=i ;j++,k-- )
			{
				if (j%2 == 0)
				{
                   	System.out.print("*");
				}
				else 
				{
					if (i%2 == 0)
					{
						System.out.print((i*k)+j);
					}
					else
					{
						System.out.print((i*k)+j);
					}
				}

			}
			System.out.println();
		}
	}
}
