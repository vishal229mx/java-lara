class C 
{
   void test1()
	{
       System.out.println("C-test1()");
    }
}
class D extends C
{
	void test2()
	{
	  System.out.println("D-test2()");
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.test1();
		System.out.println("----------");
		d1.test2();
		System.out.println("----------");
	}
}
