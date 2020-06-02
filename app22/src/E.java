class E
{
	
	{
	   System.out.println("IIB");
	 }

	E()
	{
	  System.out.println("E()");
	}


	static
	{
	   System.out.println("SIB");
	}

	public static void main(String[] args) 
	{ 
		System.out.println("main begin");
		E e1 = new E();
		System.out.println("--------");
	    E e2 = new E();
		System.out.println("--------");
	    E e3 = new E();
		System.out.println("--------");
	    System.out.println("main end");
	}
}