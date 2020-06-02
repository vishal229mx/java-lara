class G 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		main(args);                       //java.lang.StackOverflowError
		System.out.println("main end");
	}
}
