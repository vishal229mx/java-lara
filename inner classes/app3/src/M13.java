class M13 
{
	public static void main(String[] args) 
	{
		C c1 = new C()
		{
			void test1()
			{
				System.out.println("from AIC.test1()");
			}
		};
		c1.test1();
		c1.test2();
		System.out.println("done");
	}
}
//anonymous innerclass should not be an abstract
//for object cration purpose we are developing anonymous class bt if anonymous classs is abstract then we cannot able to create an obj
//we cannot create more than one object to same anomymous class

/*

M13.java:6: error: <anonymous M13$1> is not abstract and does not override abstr
act method test2() in C
                {
                ^
1 error

*/