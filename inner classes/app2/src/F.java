class F 
{
	class B
	{
	}
	static class C
	{
	}
	public static void main(String[] args) 
	{
		B b1 = new F().new B();//instead of using a reference we also can use object straigth away coz reference is also pointing to object internally
		C c1 = new C();
		System.out.println("done");
	}
}

