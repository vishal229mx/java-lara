class V
{
	    static int i = test();

		public static int test() 
	{
		System.out.println("from test1:" + i);
		main(null);  
	    System.out.println("from test2:" + i);
		return i + 20;
	}
	public static void main(String [] args) 
	{
	
		System.out.println("main:" + i);
        i +=10;
	}
}