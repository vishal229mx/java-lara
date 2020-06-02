abstract class A 
{
	abstract void test();
}
class B extends A
{
	void test()
	{
		System.out.println("from B.test()");
	}
}
class C extends A
{
	void test()
	{
		System.out.println("from C.test()");
	}
}
class M4
{
   public static void main(String[] args) 
	{
	   A a1 = new B();
	   A a2 = new C();
	   A[] elements = {a1, a2};
	   for(A element : elements)
	   {
	        element.test();//this stmt iterating 3 times... stmt is not changing same stmt.bt three times executing three diff mehtods
	   }
	 }
}

//same stmt showing multiple forms-->>polymorphism