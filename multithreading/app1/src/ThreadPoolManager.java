import java.util.*;
class ThreadPoolManager 
{
	private ArrayList list = new ArrayList();
	public void init()
	{
		GenericThread t1 = null;
		for (int i = 1; i <= 10; i++)//req no of threads // 10 generic threads are storing in list
		{
			t1 = new GenericThread();
			t1.start();
			list.add(t1);
		}
	}
	public GenericThread checkOut()
	{
		GenericThread t1 = null;
	    if (list.size() > 0)
	    {
             t1 = (GenericThread)list.remove(0);
	    }
		else
		{
			t1 = new GenericThread();
			t1.start();
		}
		return t1;
	}
	public void checkIn(GenericThread t1)
	{
		if (list.size() < 10)
		{
			list.add(t1);
		}
		else
		{
			t1.stop();
		}
	}

	public void release()
	{
		GenericThread t1;
		for (int i = 0; i < list.size(); )
		{
			t1 = (GenericThread)list.remove(i);
			t1.stop();
		}
	}
}
//multiple threads containing in a container we can consider as a pool









