class D 
{
	class B
	{
	}
	static class C
	{
	}
	public static void main(String[] args) 
	{
		B b1 = new B();//we cannot use non static member inside a static we getting compile error
		C c1 = null;
		System.out.println("done");
	}
}
//we  cannot create an obj of B in the main method

/*


D.java:11: error: non-static variable this cannot be referenced from a static co
ntext
                B b1 = new B();
                       ^
1 error
*/