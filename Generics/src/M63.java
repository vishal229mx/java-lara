//method wise generic
class A 
{
	static <T> void test(T obj1, T obj2)
	{
	}
}
class M63
{
	public static void main(String[] args) 
	{
		A.<Integer>test(100,200);//if method data type specifies as integer then both arg are int 
		A.<String>test("abc", "xyz"); //while calling second time here data type specifies as string
		System.out.println("done");
	}
}
//method level generic

//before return type we can use identifier to the generic
//method can be static or can be non static