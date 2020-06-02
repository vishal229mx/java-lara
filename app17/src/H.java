class H
{
	static int i = test();
	static
	{
	  System.out.println("SIB1");
	}
	static int j = test();
	public static int test() 
	{
		System.out.println("test");
		return i+j+10;
	}

    public static void main(String[] args) 
	{
		System.out.println("main" + i +"," + j);
	}

	static
	{
	  System.out.println("SIB2");
	}
}
