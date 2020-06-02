 class  Z5
{
	
public static void main(String[] args)  
	{
	    
		System.out.println("main begin");
		int i=test();
		System.out.println("----------" );
		int j=i +test();
		System.out.println("----------" );
		int k=i+ j+ test() +test();
		System.out.println("----------" );
		
		System.out.println(i + j +test() );
		System.out.println("----------" );
		System.out.println(test() +test() +i + j +k );
		System.out.println("main end" );
	}
public static int test()  
	{
	    
		System.out.println(" FROM test");
		return 1000;
	}
		
}