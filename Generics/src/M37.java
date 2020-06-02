class A <X>
{
	void test(X obj)
	{
	}
}
class M37
{
	public static void main(String[] args) 
	{
		A < ? extends Number> a1 = null;
		a1 = new A<Integer>();
		a1.test(10);//it can be double , byte, any type of Number type we cant supply any specific value of any wrapper class values
		System.out.println("done");
	 }
}
