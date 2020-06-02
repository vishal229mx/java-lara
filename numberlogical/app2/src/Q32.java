//32. Develop a program to print 30 prime numbers which
//    are having digits  in the descending  order after 10
//ex. 31, 41, 43 , 51, 53, 61, 71, 73....
class  Q32
{
	public static void main(String[] args) 
	{
		int count = 1;
		outer:
		for(int i = 10;  count<=10 ; i++)
		{
			for (int j = 2; j <= i/2 ; j++ )
		    {
				if (i%j == 0)
				{
				   continue outer;
				}
		    }
			int num = i;
			count++;
            while (num != 0)
            {
				int x = num%10;
				num /= 10;
				if( num < x)
				{
                     System.out.print(i + ",");
 				}
				
            }
			
		}
	}
}
