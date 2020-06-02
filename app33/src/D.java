class D 
{
	int i;
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.i = 10;
		
		final D d2 = new D();//d2 is final and i is not final so d2 is not reinitializing here only value of i so it will compile success
		d2.i = 10;

		d1.i = 10;
		d2.i = 10;
		System.out.println("done");
	}
}
