class  L
{
	
public static void main(String[] args)  
	{
	    
		System.out.println("main begin");
		test();
		System.out.println("main end:" );
	}
public static void test(int i)  //method can take any no. of argument...like(int i) //every argument is local to the same method 
                                
	{
		System.out.println("from test");
	}
		
}
/* while calling a method u should supply value to every argument