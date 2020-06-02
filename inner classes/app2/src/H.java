class H 
{
	class B
	{
	}
	static class C
	{
	}
	public static void main(String[] args) 
	{
		H.B b1 = new H().new B(); //while using inner class using for reference purpose we always go for outer.inner no matter inner is static or non static
		H.C c1 = new H.C();
		System.out.println("done");
	}
}

//reference is always outer.inner in case of inner class reference