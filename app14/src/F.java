class  F
{
	
public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("--------");
	    test();
		System.out.println("main end");
	}
public static void test() 
	{
		System.out.println(" test begin");
		int i=20;
		System.out.println("from test" + i);
		i=30;
		System.out.println("from test" + i);
		System.out.println("test end");
	}
}
