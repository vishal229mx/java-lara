class I 
{
	static int x=test();
    public static int test() 
	{
		System.out.println("test:" + x);
		System.out.println("test:" + I.x);
		return 10;
	}
	static
	{
	  	System.out.println("I-sib:" + x);
	}

}
class J
{
	static
	{
	   	System.out.println("J-sib:");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
	    System.out.println("main:" + I.x);
		I.test();
		System.out.println("main end");
	}
}
