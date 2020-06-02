class M24
{
	static void  test1(Integer obj)
	{
		System.out.println("test1(Integer)");
	}
	static void  test1(Number obj)
	{
		System.out.println("test1(Number)");
	}
	public static void main(String[] args) 
	{
		byte b1 = 10;
		test1(b1);
		System.out.println("done");
	}
}

//we know 1st preference to widening...bt there is no suitable mehtod for widening so here auto boxing is done...
//bcoz of upcasting number is preffered