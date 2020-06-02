class C 
{
	public static void main(String[] args) 
	{
		System.out.println("main-begin");
		for(int i = 6;i <= 5;i++)
		{
			System.out.println("loop body");
			System.out.println("loop body:" + i);
			System.out.println("----------------");
		}
		System.out.println("main-end");
	}
}
// i is local variable to for loop
//initial value of loop also checked with the boolean expression
