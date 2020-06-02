class V
{
	V()throws ClassNotFoundException 
	{
			System.out.println("V()");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		V v1 = new V();	//caller of the constructor should have try catch or throws
		System.out.println("main end");
	}
}