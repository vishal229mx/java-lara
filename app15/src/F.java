 class  F
{
	
public static void main(String[] args)  
	{
	    
		System.out.println("main begin");
		int i =  test1();
		int j =  test2();
		System.out.println("main end:" + i + "," + j);
	}
public static int test1()  
	{
	    
		System.out.println("from test1");
		return test2(); //return value of another method can be possible bt on 1 condn that both have same return type
	}
public static int test2()  
	{
	    
		System.out.println("from test2");
		return 300;
	}
		
}