class A 
{
	static <T> void test(T obj1, T obj2)
	{
	}
}
class M64
{
	public static void main(String[] args) 
	{
		A.test(100,200); //obj1 data type is a object and obj2 data type is a object
		A.test("abc", "xyz");
		A.test("abc", 500);
		A.test(4.5, "test");
		System.out.println("done");
	}
}