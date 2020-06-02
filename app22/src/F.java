class F
{
	static int counter;

	F()
	{
	 counter++;
	}

	public static void main(String[] args) 
	{ 
	    F f1 = new F();
	    F f2 = new F();
	    F f3 = new F();
	    F f4 = new F();
		System.out.println(F.counter);
	  }
}