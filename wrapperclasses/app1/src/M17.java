class M17
{
	static void test(Integer i)
	{
		System.out.println("test(Integer)");
	}
	public static void main(String[] args) 
	{
		test(10); // test(new Integer(10));   //in case of 10 we dont supply 10..10 should be boxed into the obj.. here boxing is happening automatically by the compiler
        System.out.println("------------------");
		Integer obj = new Integer(90);
		test(obj); //we are suppling a ref. here  		
	}
}
