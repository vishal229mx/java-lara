class U
{
	    static int i = test();

		public static int test() 
	{
		System.out.println("from test1:" + i);
		main(null); //default value of every data type is null. 
	    System.out.println("from test2:" + i);
		return 10;
	}
	public static void main(String [] args) 
	{
		i=5;
		System.out.println("main:" + i);
	}
}