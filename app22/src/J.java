class J
{
	 int counter;

	J()
	{
		 System.out.println("J()");
	}

	J(int i)
	{
	     this();
		 System.out.println("J(int)");
	}
	
	J(int i, int j)
	{
		this(10);
		 System.out.println("J(int,int)");
	}

    {
	  counter++;
	   System.out.println("J=IIB");
	}  

	public static void main(String[] args) 
	{ 
	    J obj1 = new J();
	    System.out.println("---------");
	    J obj2 = new J(10);
	    System.out.println("---------");
	    J obj3 = new J(10,20);
	    System.out.println("---------");
	    System.out.println(obj1.counter);
	    System.out.println(obj2.counter);
	    System.out.println(obj3.counter);
	  }
}