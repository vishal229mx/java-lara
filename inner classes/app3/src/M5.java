class M5 
{
	public static void main(String[] args) 
	{
		A a1 = new A()
		{
				void test1()
				{
					  System.out.println("AIC.test1()");
				}
                void test2()
				{
					  System.out.println("AIC.test2()");
				}
				void test3()
				{
					  System.out.println("AIC.test3()");
				}
		};
		a1.test1();
		a1.test2();
		a1.test3();
	}
}
//compile will only check A we get compile type error even though we are declaring test3 in anonymous class
//new member of anonymous inner class we are developing, cannot be used frm outside
/*

M5.java:22: error: cannot find symbol
                a1.test3();
                  ^
  symbol:   method test3()
  location: variable a1 of type A
1 error

*/