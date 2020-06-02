class A extends Thread 
{
	public void run()
	{
		   System.out.println("child begin");
		   int i = 10/0;
		   System.out.println("child end");
	   }
}
class M33
{
	public static void main(String[] args) 
	{ 
		A a1 = new A();
		a1.start();
		Util.sleep(5000);
		System.out.println("main end");
	}
}
//if child thread is reciving an exception child thread is only terminating main thread is not effecting
//which ever thred is reciving an exception that thread only terminating other can not  effecting