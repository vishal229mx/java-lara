class F
{
	static void test(int i)
	{
		if (i == 10)
		{
			return;
		}
		i++;
		test(i);
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		test(0);
	}
}

//here in post execution of recursion 10 to 1