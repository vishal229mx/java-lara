class B 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		if(true)
		{
            System.out.println("from if");
			throw new ArithmeticException("something went wrong");//used for rising error or exception explecitely
		}
		System.out.println(2);
	}
}
