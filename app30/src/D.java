class D  
{
	public static void test(int d1) 
	{
		System.out.println("test:" + d1);
	}
	public static void main(String[] args) 
    {
		byte b1 = 100;
		short s1 = 100;
		int i = 100;
	    test((int)b1);//this explicit converision is not req bt we can do it will automatically done by compiler,,
		test((int)s1);
		test(i); 
	}
}