class  A
{
	public static void test() 
	{
		System.out.println("test()");
	}
	static void test(int i) 
	{
		System.out.println("test(int)");
	}
	private static void test(int i, int j) 
	{
		System.out.println("test(int,int)");
	}
	protected static void test(double i) 
	{
		System.out.println("test(double)");
	}
}
//overloaded method have any no. of access levels
//same method name and different signature all are coming under method overloading