class A <T>
{
	void mehtod(T obj)
	{
	}
}
class M50
{
	static void test(A<? extends Number> arg) 
	{
		arg.method(new Double(1.5));	
	 }
}
