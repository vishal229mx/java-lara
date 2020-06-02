class A extends Thread
{
	public void run()
	{
		for (int i = 1; i <= 200; i++)
		{
			System.out.println(i + ":" + getName());
			yield();
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for (int i = 1; i <= 200; i++)
		{
			System.out.println(i + ":" + getName());
			yield();
		}
	}
}
class M63
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.start();
		B b1 = new B();
		b1.start();
	}
}
//yield(); -->> by yield only one thread doesnot iterate for long and giving chance to another thread 