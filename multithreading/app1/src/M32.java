class A extends Thread 
{
	public void run()
	{
		   System.out.println("child begin");
		   Util.sleep(3000);
		   System.out.println("child end");
	   }
}
class M32
{
	public static void main(String[] args) 
	{ 
		A a1 = new A();
		a1.start();
		Util.sleep(5000);
		a1.interrupt();
	}
}
//after 5 sec main is intrrupted