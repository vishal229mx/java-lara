class F
{
	public static void main(String[] args) 
	{
		System.out.println("main-begin"); 
		for(int i = 6;i >= 1;i -= 2)   // (i-=2) == (i = i- 2) one and the same thing
		{
			System.out.println("loop body");
			System.out.println("loop body:" + i);
			System.out.println("----------------");
		}
		System.out.println("main-end");
	}
}