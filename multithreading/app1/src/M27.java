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
class M27
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.start();
		try
		{
			a1.join();
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("from main end:");
	}
}
//while calling join() method main thread not continue further child execution got over.than parent will be execute
//parent will be not continue further

//parent is depending on child
//child is depending on parent
//no warry chaild execute