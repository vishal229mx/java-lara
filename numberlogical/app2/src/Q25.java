//25. Develop a program to print 20 prime numbers from 100?
class  Q25
{
	public static void main(String[] args) 
	{
		int count = 1;
		outer:
		for (int i = 100; count <= 20  ; i++ )
		{
			for (int j = 2; j <= i/2 ; j++ )
		    {
				if (i%j == 0)
				{
					continue outer;
				}
		    }
			if(count == 1)
            {   
			  System.out.print( i );
			}
			else
			{
				System.out.print(  "," + i );
			}
		  count++;
		}
	}
}
