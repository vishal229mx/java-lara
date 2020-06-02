interface A
{
	void test1();
	void test2();
}
class L implements A
{
	public void test1()
	{
		System.out.println("from L.A()");
	}
	public void test2()//if interface implements methods are not public then compile time error
	{
		System.out.println("from L.A()");
	}
	public static void main(String [] args)
	{
		A a2 = null;
		L obj1 = new L();
		obj1.test1();
		obj1.test1();
	    System.out.println("done");
	}
}