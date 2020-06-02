class A
{
	static A obj;
	protected void finalize()
	{
		obj this;
        System.out.println("from finalize()");
	}
}
class M3
{
	public static void main(String[] args) 
	{
		System.out.println("1: " + A.obj);
		A a1 = new A();
		System.out.println("a1: " + a1);
		a1 = null;
		Runtime.getRuntime().gc();
		Thread.sleep(10);
		System.out.println("2: " + A.obj);
		A.obj = null;
		Runtime.getRuntime().gc();
		Thread.sleep(10);
		System.out.println("3: " + A.obj);
	}
}
