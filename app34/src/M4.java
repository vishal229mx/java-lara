class A 
{
	static final void test1()
	{
	}
	static void test2()
	{
	}
}
class B extends A
{
	static void test1()
	{
	}
	static void test2()
	{
	}
}
class M4
{
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
//by defalult static mehtod as a final bcz we cannot modify final
//static mehtod cannot modify in sub class or further ... it only one time deveopment
//while declaring as a final .. subclss mthod should not develop a final 
//here overriding is not happening bt for every superclass a new method is developing in the inherited class boz of super class methods are static


/*


M4.java:12: error: test1() in B cannot override test1() in A
        static void test1()
                    ^
  overridden method is static,final
*/