 class  A
{
	
public static void main(String[] args)  
	{
	    
		System.out.println("main begin");
		int i =  test();
		System.out.println("main end:" + i );
	}
public static int test()  
	{
	    
		System.out.println(" FROM test");
		return 100;
	}
		
}