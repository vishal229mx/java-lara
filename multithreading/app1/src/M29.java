class A extends Thread 
{
	public void run()
	{
		
		for (int i = 100;i<110 ;i++ )
		{
			System.out.println(i);
		try
		{
			sleep(3000);
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
	  }
   }
}
class M29
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.start();
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
		
	}
  }
}
//in both the thred is sleep() is there 
//wher ever you calling sleep() required a try catch
//join() sleep() and wait();
//sleep() method is method taking a long number
//