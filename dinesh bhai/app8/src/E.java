class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main-begin");
		for(int i = 6;i >= 1;i = i - 2)
		{
			System.out.println("loop body");
			System.out.println("loop body:" + i);
			System.out.println("----------------");
		}
		System.out.println("main-end");
	}
}
//when we have to print same content many times then we use loops