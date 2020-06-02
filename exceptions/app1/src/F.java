class F 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String s1 = "hello";
		String s2 = s1.substring(5,10);     //java.lang.StringIndexOutOfBoundsException
		System.out.println("main end");
	}
}
