interface A
{
	void test1();
	
}
interface B
{
	void test2();
}
interface C extends A, B //interface can extends any no of interface
{
	void test3();
}
class Q implements C
{
	public void test1()
	{
        System.out.println("from test1()");
	}
	public void test2()
	{
        System.out.println("from test2()");
	}
	public void test3()
	{
        System.out.println("from test3()");
	}
	public static void main(String [] args)
	{
		Q q1 = new Q();
		q1.test1();
		q1.test2();
		q1.test3();
		System.out.println("done");
	}
}
//calss extents to another class
//interface extends to another interface
//one inheritance can extends to any no. of super interfaces

//while representing interface shown with dotted line and inheritance with solid line