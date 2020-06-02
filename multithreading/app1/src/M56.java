class A extends Thread
{
	public void run()
	{
		System.out.println("run begin");
		Util.sleep(3000);
		synchronized (this)
		{
            System.out.println("child is synchronized block");
		}
		System.out.println("run end");
	}
}
class M56
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A a1 = new A();
		a1.start();
		Util.sleep(1000);
		synchronized (a1)
		{
			try
			{
				a1.join();  //whenever thread is going to join whether lock is releasing or not
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("main end");
	}
}
//main-depends>>child-req>>obj lock-in>>main mehtod