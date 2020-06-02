class Shared 
{
	synchronized void test1()
	{
		Thread t1 = Thread.currentThread();
		for (int i = 0; i< 200 ;i++ )
		{
			System.out.println("test1: " + i + ":" + t1.getName());
		}
	}
	synchronized void test2()
	{
		Thread t1 = Thread.currentThread();
		for (int i = 0; i< 200 ;i++ )
		{
			System.out.println("test2: " + i + ":" + t1.getName());
		}
	}
}
	class A extends Thread 
	{
		Shared s1;
		A(Shared s1)
		{
			this.s1 = s1;
		}
		public void run()
		{
			s1.test1();
		}
	}
	class B extends Thread
	{
		Shared s1;
		B(Shared s1)
		{
			this.s1 = s1;
		}
		public void run()
		{
			s1.test2();
		}
	}
	class M40
	{

		public static void main(String[] args) 
		{
			Shared s1 = new Shared();
			A a1 = new A(s1);
            B b1 = new B(s1);
			a1.start();
			b1.start();
		}
	}