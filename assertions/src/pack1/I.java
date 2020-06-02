package pack1;
class I
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert true :test();//we cannot call a method after colon which returning void
		System.out.println(2);
	}
	static int test()
	{
		return 10;
	}
}
