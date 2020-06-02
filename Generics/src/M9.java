class A
{
	Double test()
	{
		return null;
	}
}
public class M9 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		Double d1 = a1.test();
		Double d2 = a2.test();
		System.out.println("done");
	}
}