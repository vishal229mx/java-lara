class H 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
        int[] x = new int[999999999];     //java.lang.OutOfMemoryError: Java heap space not sufficient
		System.out.println("main end");
	}
}
//array size should be in the int range for compile successfully