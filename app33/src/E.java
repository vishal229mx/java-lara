class E 
{
	final int i = 10;//only i is final and we are not modifying i so compile is success
	public static void main(String[] args) 
	{
		E e2 = new E();
		e2 = new E(); 
		System.out.println("done");
	}
}
