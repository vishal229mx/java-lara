class A
{
	protected void finalize()
	{
        System.out.println("from finalize()");
	}
}
class M2
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a1 = new A();
		A a1 = new A();
		a1.obj = a2;
		a2.obj = a3;
		a3.obj = a1;
		a1 = a2 = null;
		System.gc();
		//Runtime.getRuntime().gc();
		System.out.println("done");
	}
}