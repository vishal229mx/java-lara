class A 
{
	static <T , S> S test(T obj1, S obj2)//by comma as a seperator we can specify any no. of generics
	{
		return obj2;
	}
}
class M67
{
	public static void main(String[] args) 
	{
		String s1 = A.<Integer, String>test(100, "abc");
		System.out.println("done with " + s1);
	}
}