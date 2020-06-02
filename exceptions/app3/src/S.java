class S 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();//it req try cathch or main method should have throws
		System.out.println("main end");
	}
	public static void test() throws ClassNotFoundException
	{
		System.out.println("from test");
	}
}