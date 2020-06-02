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
class M28
{
	public static void main(String[] args) 
	{
		for (int i = 1;i<10 ;i++ )
		{
			System.out.println(i);
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("from main end:");
	}
  }
}
//join() sleep() and wait();
//sleep() method is method taking a long number
//