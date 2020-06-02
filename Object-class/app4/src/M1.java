class A
{
	protected void finalize()
	{
        System.out.println("from finalize()");
	}
}
class M1
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1 = null;
		System.gc();
		//Runtime.getRuntime().gc();
		System.out.println("done");
	}
}
//ways to make request to gc--
//-->>1.  System.gc();
//-->>2.  Runtime.getRuntime().gc();

//whenever object become garbage then on last step finalize() calls and remove object


