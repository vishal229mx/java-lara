class P 
{
	public static void main(String[] args) 
	{
		int i = 10;
		final int j = 10;
		class A //class A test method depending on i
		{
			void test()
			{
                System.out.println(i);
                System.out.println(j);
			}
		}
		A a1 = new A();
		a1.test();
		//i=20;
		a1.test();
		System.out.println("done");
	}
}
//if we want to use i into the inner class A dont use i inside A only use if it is final