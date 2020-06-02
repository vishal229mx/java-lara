interface A
{
	void test1();
	
}
interface B
{
	void test2();
}
class P implements A, B
{
	public void test1()
	{
        System.out.println("from test1()");
	}
	public void test2()
	{
        System.out.println("from test2()");
	}
	public static void main(String [] args)
	{
		P p1 = new P();
		p1.test1();
		p1.test2();
		System.out.println("done");
	}
}
//same/one class can implement any no. of super interfaces...
//Multiple inheritence is allow through super inheritance
//one class cannot extend multiple super classes