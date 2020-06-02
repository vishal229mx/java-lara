class E 
{
	static void test(int i)
	{
		if (i > 10)
		{
			return;
		}
		System.out.println(i);
		i++;
		test(i);
	}
	public static void main(String[] args) 
	{
		test(1);
	}
}
//here on pre execution  of recursion 1 to 10 