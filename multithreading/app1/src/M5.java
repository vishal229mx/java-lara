class A implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 200 ; i++)
		{
			System.out.println("from child" + i);
		}
	}
}
class M5
{
	public static void main(String[] args) 
	{
		A a1 = new A();//here thread is not created in the obj boz A class is not a thread type,or a subclass to thread 
		Thread t1 = new Thread(a1); //we are supplying a ref.(a1) of runnable clss for the thread class constructor.. so new thread is creating
		t1.start(); //while caling start() new thread is registering to thread method and allocating
		for (int i = 300; i < 500 ; i++)
		{
			System.out.println("from main: " + i);
		}
	}
}
//designing a class by making subclasss to runnable.. runnable interface is available in java.lang package
//runnable interface is a functional interface.. 
//functional interface-->>is a interface which containng only one method
//runnable interface containing run mehtod

//we cannot call a1.start()...bcoz a1 is not a ref of thread class....so we are calling t1.start...
