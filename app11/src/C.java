class C
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int[] elements = {10,20,40,80,100,15};
		
		for(String element : elements) //for-each or enhanced for loop
		{
		  System.out.println("loop body" + element);
		}
		System.out.println("main end");
	}
}
