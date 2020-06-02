class S
{
	    static int i = test();//initializers are executing before main method
		public static int test() 
	{
		System.out.println("from test:");
		return 10;
	}
	public static void main(String [] args) 
	{
		System.out.println("main:" + i);
	}
}