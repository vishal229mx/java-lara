
class Shared 
{
	synchronized void test1()
	{
		Thread t1 = Thread.currentThread();
		System.out.println("test1 begin by " + t1.getName());
		try
		{
			wait();
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("test1 end by" + t1.getName());
	}
	synchronized void test2()
	{
		Thread t1 = Thread.currentThread();
		System.out.println("test2 begin by " + t1.getName());
		notify();
		System.out.println("test2 end by" + t1.getName());
	}
}
	class A extends Thread 
	{
		Shared obj;
		A(Shared obj)
		{
			this.obj = obj;
		}
		public void run()
		{
			obj.test1();
		}
	}
	class B extends Thread
	{
		Shared obj;
		B(Shared obj)
		{
			this.obj = obj;
		}
		public void run()
		{
			obj.test1();
		}
	}
	class M47
	{

		public static void main(String[] args) 
		{
			Shared obj = new Shared();
			A a1 = new A(obj);
            B b1 = new B(obj);
			a1.start();
			b1.start();
			Util.sleep(10000);
			System.out.println("after sleep");
			obj.test2();
		}
	}

/*
public void wait()
public void notify()
public void notifyall()

these three mthdos are avalilable in every calss
all three are non static
thrad can call thir method from any reference variable
*/

