class M20
{
  public static void main(String[] args)
	{
	  Thread t1 = Thread.currentThread();
      System.out.println("priority" + t1.getPriority());
	  t1.setPriority(Thread.MIN_PRIORITY);
      System.out.println("priority" + t1.getPriority());
	}
}
/*
priority5
priority1
*/

/*
Thread.MIN_PRIORITY = 1
Thread.NORM_PRIORITY = 5
Thread.MAX_PRIORITY = 10
*/