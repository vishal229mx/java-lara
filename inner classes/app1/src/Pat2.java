/*Q
   011111
   101111
   110111
   111011
   111101
   111110
*/
class  Pat2
{
	public static void main(String[] args) 
	{ 
		for (int i=0;i<6 ;i++ )
		{
			for (int j=0,k=i;j<6 ;j++ )
			{
				if (i == j)
				{
					System.out.print(0);
				}
				else
			    {
                    System.out.print(1);
				}
			}
			System.out.println();
		}
	}
}
