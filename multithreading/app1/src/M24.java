class A extends Thread 
{
	A(String name)
	{
	  super(name);
	}
	public void run()
	{
	   System.out.println("from child:");
	   System.out.println("id:" + getId());
	   System.out.println("name:" + getName());
	   System.out.println("priority:" + getPriority());
	   System.out.println("Daemon:" + isDaemon());
	}
}
class M24
{
	public static void main(String[] args) 
	{
		A a1 = new A("FIRST CHILD THREAD");
		a1.start();
	}
}
// threi are two set the name