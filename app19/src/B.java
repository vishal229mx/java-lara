class  B
{
	static int i = 10;
	static
	{
	    System.out.println("sib:" + i); //direct
		test();
	}
	public static void test() 
	{
		System.out.println("test:" + i); //indirect  
	}
public static void main(String[] args) 
	{
		System.out.println("main:" + i);
	}
}
//initially variable will be in the state of indirect read (any kind of write is allow) 

