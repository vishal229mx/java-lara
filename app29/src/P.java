class A 
{
	void test() 
	{
		System.out.println("from A.main");
	}
}
class P extends A
{
	void test()
	{
		System.out.println("from P.test()");
	}
	public static void main(String[] args) 
	{
		P p1 = new P();
		p1.test();
		System.out.println("done");
	}
}
//while overriding---> same signature in the subclass then inherited method attemted to override
//while overriding same return type(should not be changed) and same signature