class  E
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			  //try can be empty ,,compiler dont bother wehther stmts are there or not
		}
	
		catch (ArithmeticException ex)
		{
            System.out.println("ex");
		}
		System.out.println("main end");
	}
}