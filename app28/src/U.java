class U 
{
	static void test()
	{
        System.out.println("test()");
	}
	static void test(int i)
	{
        System.out.println("test(int)");
	}
	static void test(double i)
	{
        System.out.println("test(double)");
	}
	public static void main(String[] args) 
	{
		test();
		System.out.println("---------------");
	    test(20);
		System.out.println("---------------");
	    test(20.9);
		System.out.println("---------------");
	}
}
//same no of method names can created bt argument should be different or data type of the arg
//method overloading
