 class  H
{
	
public static void main(String[] args)  
	{
	    
		System.out.println("main begin");
		int i =  test1();
		System.out.println("-------------");
		int j =  test1() +test2();
		System.out.println("-------------");
		int k =  test1() +test2() + test3();
		System.out.println("-------------");
		System.out.println( test3() +test2() + test1());
		System.out.println("-------------");
		System.out.println("main end:" + i + "," + j + "," + k);
	}
public static int test1()  
	{
	    
		System.out.println("from test1");
		return test2() + test3();
	}
public static int test2()  
	{
	    
		System.out.println("from test2");
		return 300 +test3();
	}
public static int test3()  
	{
	    
		System.out.println("from test3");
		return 200;
	}
		
}