class A extends Thread 
{
	public void run()
	{
		for (int i =1;i<=2000 ;i++ )
		{
			System.out.println(" child:"+i);
		}
	 }
}
class M26
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.setDaemon(true);
		a1.start();
		System.out.println("from main end:");
	}
}
//Daemon is always depending on parent
//now child is a daemon whenever parent is living child is also living