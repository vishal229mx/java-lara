class  G
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		try
		{
			  Class.forName("");
		}
	
		catch (ArithmeticException ex)
		{
            System.out.println("ex");
		}
		System.out.println(2);
	}
}