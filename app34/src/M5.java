class A 
{
	private final void test1()//we can declare private member is final ... no need of declaring it bcoz private method cannot be inheriting
	{
	}
}
class B extends A
{
	void test1()
	{
	}
}
class M5
{
	public static void main(String[] args) 
	{

		System.out.println("done");
	}
}