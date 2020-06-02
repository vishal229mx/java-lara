class G 
{
	static int x;
    	public static void test() 
	{
		System.out.println("test:" + x);
		System.out.println("test:" + G.x);
	}
	static
	{
	  	System.out.println("G-sib:" + x);
	}

}
class H
{
	static
	{
	   	System.out.println("H-sib:");
	}

	public static void main(String[] args) 
	{
		System.out.println("main:" + G.x);
	    G.test();
	}
}
