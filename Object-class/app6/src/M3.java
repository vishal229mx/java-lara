class A
{
	static
	{
		System.out.println("A.SIB");
	}
}
class  M3                                                                                                                                                                                                                                                                                                                                                                                                           
{
	public static void main(String[] args) throws Exception 
	{
		System.out.println("main begin");
		Class c1 = Class.forName("A");
		System.out.println("----------");
		System.out.println(c1);
        System.out.println("main end");
	}
}