class Z 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
            System.out.println(1);
			int i = 10 / 0;
			System.out.println(2);
		}
		catch (ArithmeticException ex)
		{
			System.out.println(3);
			int i=10/0;            //exception object is occuring in catch cannot handeled by catch only if try have exc. handled by catch
			System.out.println(4);
		}
		System.out.println("main end"); 
	}
}
