class D 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int[] x = {10,20,30};
		int i =x[9];                   //java.lang.ArrayIndexOutOfBoundsException
		System.out.println("main end");
	}
}
