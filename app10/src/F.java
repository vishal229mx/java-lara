class  F
{
	public static void main(String[] args) 
	{
		System.out.println("Main-begin");
		for(int i=6;i>=1;i -= 2)
		{
		  System.out.println("loop body");
		  System.out.println("loop body" + i);
		  System.out.println("---------");
		}
		System.out.println("Main-end");
	}
}
