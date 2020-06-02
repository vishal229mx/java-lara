class  G
{
	
public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("--------");
	    test2();
		System.out.println("main end");
	}
public static void test1() 
	{
		System.out.println(" test1 begin");
		int i=20;
		System.out.println("from test1 end" + i);
	}
public static void test2() 
	{
		System.out.println(" test2 begin");
		int i=40;
		System.out.println("from test 2 end" + i);
	}
		
}
