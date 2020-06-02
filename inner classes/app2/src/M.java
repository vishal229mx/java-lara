class M
{
	public static void main(String[] args) 
	{
		class A
		{
		void test()
			{
                System.out.println("from A");
                System.out.println("from A");
                System.out.println("from A");
                System.out.println("from A");
			}
		}
		A a1 = new A();
			a1.test();
			a1.test();
			a1.test();
			System.out.println("done");
		}
}
//mthod can always be local to inner class bt we cannot devp method inside a mthod 
//if we want a method under method we can simply use inner class for that