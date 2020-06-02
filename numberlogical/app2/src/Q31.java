//31. Develop a program to print 30 prime numbers which
//    are having digits  in the rising order after 10
//ex. 13, 17, 19 , 23, 29, 37, 39, 47....
class  Q31
{
	public static void main(String[] args) 
	{
		int count = 1;
		outer:
		for(int i = 10;  count<=30 ; i++)
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
			th:
            while (num != 0)
            {
				int x = num%10;
				num /= num;
				int y = num%10;
				if( y < x)
				{
                     System.out.print(i + ",");
					 num = 0;
 				}
            }
			
		}
	}
}

/*
static boolean isRaising Order(int i)
{
	boolean isRising = true;
	int j = i, currentDigit,prevDigit = i% 10;
	j = j/10;
	while(j !=0)
	{
		currentDigit = j % 10;
		if(currentDigit >= prevDigit)
		{
			isRaising = false;
			break;
		}
		prevDigit = currentDigit;
		j=j/10;
	}
	return isRaising;
}


*/