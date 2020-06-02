class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i =10 /0;                      //java.lang.ArithmeticException
		System.out.println("main end");
	}
}
