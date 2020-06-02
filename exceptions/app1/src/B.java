class B 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String s1 = null;
		int i =s1.length();             //java.lang.NullPointerException           
		System.out.println("main end");
	}
}
