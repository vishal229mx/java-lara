class A
{
	void test(Integer arg1, String arg2)
	{
	}
}
public class M7 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		a1.test(20,"hello");
		a2.test(50,"test");
		a3.test(100,"abc");
		System.out.println("done");
	}
}