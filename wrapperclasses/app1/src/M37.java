class M37
{
	public static void  test(Integer b1) 
	{
		System.out.println("Integer");
	}
    public static void  test(Number b1) 
	{
		System.out.println("Number");
	}
    public static void  test(Object b1) 
	{
		System.out.println("Object");
	}
    public static void  test(byte ... b1) 
	{
		System.out.println("byte...");
	}
	public static void main(String[] args)
    {
		byte b1 = 10;
		test(b1);
	}
}
 
// after boxing it is automatically upcast
//third preference when no widening suitable method and no boxing suitable metod it goes to auto upcasting