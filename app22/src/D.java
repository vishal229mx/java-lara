class D
{
	
	{
	   System.out.println("D-IIB");//iib only executes only once for every object //iib execution is objext wise not constructor wise
	}

	D()
	{
		this(10);
	   System.out.println("D()");
	}


	D(int i)
	{
	   System.out.println("D(int)");
	}

	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println("--------");
	    D d2 = new D(20);
		System.out.println("--------");
	    D d3 = new D();
		System.out.println("--------");
	    D d4 = new D(30);
		System.out.println("--------");
	}
}