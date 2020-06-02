class J 
{
	static int x = test();
	static
	{
	    System.out.println("SIB" + x);
	}
	
	public static int test() 
	{
		System.out.println("from test" + x);
		return 100;
	}
    
	public static void main(String[] args) 
	{
		System.out.println("from main:" + x);
	}
}
