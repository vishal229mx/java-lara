class K
{
	public static void main(String[] args) 
	{
		class A
		{
			void test()
			{
                System.out.println("done");
			}
		}
		A a1 = new A();
		a1.test();
		System.out.println("done");
	}
}
//local inner class can be designed--inside a constructor,SIB,IIB body act like a local variable