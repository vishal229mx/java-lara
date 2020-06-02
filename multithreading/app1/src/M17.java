class M17
{
  public static void main(String[] args)
	{
	  Thread t1 = Thread.currentThread();
	  System.out.println("daemon" + t1.isDaemon());
	  t1.setDaemon(true);
	  System.out.println("daemon" + t1.isDaemon());
	  
	  }
}
//we can convert user thread into  daemon through setDaemon bt before main method started
//here thread is not converted bcoz main methd is starrted


/*
daemonfalse
Exception in thread "main" java.lang.IllegalThreadStateException
        at java.lang.Thread.setDaemon(Unknown Source)
        at M17.main(M17.java:7)
*/