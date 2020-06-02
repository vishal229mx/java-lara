class M19
{
  public static void main(String[] args)
	{
	  Thread t1 = Thread.currentThread();
      System.out.println("priority" + t1.getPriority());
	  t1.setPriority(11);
      System.out.println("priority" + t1.getPriority());
	}
}

/*
priority5
Exception in thread "main" java.lang.IllegalArgumentException
        at java.lang.Thread.setPriority(Unknown Source)
        at M19.main(M19.java:7)

*/