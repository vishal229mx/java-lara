class  G
{
	
	static
	{
	    System.out.println("sib1:");
		test();
	}
	static
	{
	    System.out.println("sib2:"); 
		test();
	}
      static int i;
	public static void test() 
	{
		System.out.println("test:" + i);   
	}

public static void main(String[] args) 
	{
		System.out.println("main:" + i);
	}
}
 

