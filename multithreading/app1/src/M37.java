class Shared 
{
	synchronized void test()
	{
		Thread t1 = Thread.currentThread();
		for (int i = 0; i< 200 ;i++ )
		{
			System.out.println("test: " + i + ":" + t1.getName());
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
			s1.test();
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
			s1.test();
		}
	}
	class M37
	{

		public static void main(String[] args) 
		{
			Shared s1 = new Shared();
			A a1 = new A(s1);
            B b1 = new B(s1);
			a1.start();
			b1.start();
			s1.test();
		}
	}
//we are increasing the usage of objects by using in multiple threads...
//always sharing an obhects to multiple of threads ... increase the scope or usage of the object // bt there is a limitation
//it is always possible that more than one thread using the same object simultaneously that causes ambiguity..
//avoid data corruption


//if any mehtod is declared as a synchronized this mehtod is considered as closed mehtod to a thread..
//thread cannot enter into synchronized method straight away
//thread should req object lock ... through object lock it can enter into synchronized method 

//every obj will have one object lock...while object is creating ... object lock also creates for every possible usage of object..
//while creating an object to shared, A , B and main ... for every object there is respective object lock created.. 

//this problem is avoided through synchronized