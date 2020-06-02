class K 
{
	static int x=test();
    public static int test() 
	{
		System.out.println("K.test:" + x);
		return x + 10;
	}
	static
	{
	  	System.out.println("K-sib:" + x);
        x += 10;
	}

}
class L
{
	static
	{
	   	System.out.println("L-sib:");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
	    System.out.println(K.x);
	    System.out.println("----------");
		K.x += 10;
		System.out.println("----------");
		System.out.println(K.test());
		System.out.println("----------");
		System.out.println("main end");
	}
}
