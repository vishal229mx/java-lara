class I
{
	static int counter;

	I()
	{
		 System.out.println("I()");
	}

	I(int i)
	{
		this();
		 System.out.println("I(int)");
	}
	
	I(int i, int j)
	{
		this(10);
		 System.out.println("I(int,int)");
	}

    {
	  counter++;
	   System.out.println("I=IIB");
	}  

	public static void main(String[] args) 
	{ 
	    I obj1 = new I();
	    System.out.println("---------");
	    I obj2 = new I(10);
	    System.out.println("---------");
	    I obj3 = new I(10,20);
	    System.out.println("---------");
	    System.out.println(I.counter);
	  }
}