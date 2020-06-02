class  I
{
	H(int x)   
	{
		System.out.println("I(int)");
	}
	I(double x)   
	{
		System.out.println("I(double)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		I obj1=new I(10);
		System.out.println("-----------");
		I obj2=new I(2.5);
		System.out.println("-----------");
		System.out.println("main end");
	}
}