class  C
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		try
		{
		    test();       	
		}
		catch (ArithmeticException ex)
		{
            System.out.println("ex");
		}
		System.out.println(2);
	}
     public static void test()
	{
		System.out.println(3);
		int i = 10/0;         
		System.out.println(4);
	}
}
//rising exception propogating objec call handeled....ex can be handled where called or propogated
//propogation/ducky/delicate..all are same
