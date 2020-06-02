class H
{
	static int counter;

	H()
	{
	}

	H(int i)
	{
	}
	
	H(int i, int j)
	{
	}

    {
	  counter++;
	}  

	public static void main(String[] args) 
	{ 
	    H h1 = new H();
	    H h2 = new H(2);
	    H h3 = new H(5,9);
	    H h4 = new H();
	    H h5 = new H(5);
	    H h6 = new H(10,20);
	    H h7 = new H();
	    System.out.println(H.counter);
	  }
}