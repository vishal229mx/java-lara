class I 
{
	class B
	{
	}
	static class C
	{
	}
}
class J
{
	public static void main(String[] args) 
	{
		I.B b1 = new I().new B(); //for non static this syntax obj of outerclass/ref.obj of inner class
		I.C c1 = new I.C();//for non static before obj name oter classname.static class name
		System.out.println("done");
	}
}

//we cannot use B and C straight away in the same class bcoz Band C both are members of I
//so for that we are using outer.inner same conceppt of refence type ...for other class also