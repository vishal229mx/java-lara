package pack1;
class H
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert test();
		System.out.println(2);
	}
	static int test()
	{
		return 10;
	}
}
