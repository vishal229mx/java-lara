class A <T>
{
	T obj;
}
class M47
{
	static void test(A<? extends Number> arg)
	{
	}
	public static void main(String[] args) 
	{
		test(A<Number>());
		test(A<Integer>());
		test(A<Byte>());
		test(A<String>());
		test(A<Object>());
		System.out.println("done");
	 }
}
