class A
{
	private A()
    {
		System.out.println("A()");
	}
}
class F
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("done");
	}
}
