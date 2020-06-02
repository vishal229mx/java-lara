class A
{
	void test(Integer arg)
	{
	}
}
public class M6 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		a1.test(20);
		a2.test(50);
		a3.test(100);
		System.out.println("done");
	}
}