class J 
{
	public static void main(String[] args) 
	{
		try
		{
		     System.out.println("try-begin");	
			 int i = 10/0;
		     System.out.println("try-end");	
		}
		catch (ArithmeticException ex)
		{
			System.out.println("from catch:" + ex);
			throw new ArithmeticException(ex.getMessage());//rethrowing same exc.
		}
		System.out.println("main end");
	}
}
