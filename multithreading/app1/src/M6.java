class A extends Thread
{
	public void run()
	{
		for (int i = 0; i < 200 ; i++)
		{
			System.out.println(getName() + ":" + i);
		}
	}
}
class M6
{
	public static void main(String[] args) 
	{
		A a1 = new A();//two child threads to the main thread
		A a2 = new A();
		a1.start();//both are using different copies of run method
		a2.start();
		for (int i = 400; i < 600 ; i++)
		{
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}