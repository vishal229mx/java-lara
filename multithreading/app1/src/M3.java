class A extends Thread  //this is small piece of program is executiong independently
{
	public void run()
	{
		for (int i = 0; i < 200 ; i++)
		{
			System.out.println(i);
		}
	}
}
class M3
{
	public static void main(String[] args) //main methd is executing independently
	{
		 A a1 = new A();
		 a1.start();
		for (int i = 200; i < 400 ; i++)
		{
			System.out.println(i);
		}
	}
}
//from a thread class several mthods are inheriting to A
//among all the method run method we are overriding.
//while creating a object to A class a thread is creating..
//eventhough thread is creating that thread is not knowing to the thread schedullar
//for that purpose we have to call the start() ... 
//thread is register in the thread schedullar .. allocating to execute and run through start()..

//thread is available in the java.lang package
//it is a non final class we can develop sub classes to thread class
//there are several methods in the thread class..we are all inheriting in the A class from that 2 imp methods are run and start
//we are overriding run mehtod 
//while creating object to A class thread is creating to A that means main become parent thread and A class is child thread
//in the body of the start()... a1 thread registering and schedulling to the thread schedular...






