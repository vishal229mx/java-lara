class X 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			int i = 10;
			i = 10 / 0;
		}
		catch (ArithmeticException ex)//Throwable
		{
			ex=null; 
		}
		System.out.println("main end" + ex); 
	}
}
