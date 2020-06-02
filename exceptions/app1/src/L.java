class L 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		K.x = 20;                    //java.lang.NoSuchFieldError
		System.out.println("main end");
	}
}
//if x is not in the K class then it gives this error