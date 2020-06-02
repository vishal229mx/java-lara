//34 print  Fibonacci series till to 100
class Q34  
{
	public static void main(String[] args) 
	{
		int a = 0, b=1;
		int c;
		System.out.print(a + ", "+b + ", " );
		while ((a + b) < 100)
		{
			c = a + b;
			System.out.print(c + ", ");
			a = b;
			b = c;
		}
	}
}
