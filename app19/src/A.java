class  A
{
	static int i;
	static
	{
	    System.out.println("sib:" + i); //direct-- when it comes under initilizer
		test();
	}
	public static void test() 
	{
		System.out.println("test:" + i); //indirect  --when it calls through initilizer
	}
public static void main(String[] args) 
	{
		System.out.println("main:" + i);
	}
}
//initially variable will be in the state of indirect read (any kind of write is allow) 

