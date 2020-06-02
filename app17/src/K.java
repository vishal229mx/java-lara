class K 
{
	static int x = test();
	static
	{
	    System.out.println("SIB:" + x);
	    x += 1;
		main(null);
        System.out.println("SIB:" + x);
	}
	
	public static int test() 
	{
		System.out.println("from test1" + x);
		x += 2;
		main(null);
		System.out.println("from test2" + x);
        return x + 3;
	}
    
	public static void main(String[] args) 
	{
		System.out.println("from main:" + x);
		x += 4;
	}
}
