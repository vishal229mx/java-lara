// Develop a program  to print prime number between 50 and 100?
class Q23 
{
	public static void main(String[] args) 
	{
		outer:
		for (int i =50;i<=100 ;i++ )
		{
		  for ( int j = 2;j<=(i/2) ;j++ )
		  {
            if (i%j == 0)
		    {
			  continue outer;
		    }
		  }
		  System.out.print(i + ",");
	    }
	}
}
