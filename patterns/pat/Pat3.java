/*
  Q.
    0000000
	0123450
	0234560
	0345670
	0456780
	0567890
    0000000
*/


class  Pat3
{
	public static void main(String[] args) 
	{
		for (int i= 0;i<=6 ;i++ )
		{
			for (int j=0,k=i;j<=6;j++)
			{
				if(i==0 || i==6)
                {
                     System.out.print(0);
				}
				else
				{
						if(j==0 || j==6)
						{
							 System.out.print(0);
						}
						else
						{
							System.out.print(k++);
						}
						
				}
		}
		System.out.println();
		
	}
}
}