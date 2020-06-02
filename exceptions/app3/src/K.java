class K 
{
	public static void main(String[] args)
	{
		System.out.println(1);//for compiling successfuly this testmehtod req try catch or main method should have throws
		test();  //it req try cathch or throws bcz caller can have try catch& throws not calling method
		System.out.println(2);
	}
	public static void test() throws ClassNotFoundException
	{
		System.out.println(3);
	    Class.forName("");	
		System.out.println(4);
	}
}
