class W 
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
			i = 20; 
		}
		System.out.println("main end" + i); //local members of try or catch cannot used outside of try and catch
	}
}
