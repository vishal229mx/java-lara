class M16
{
  public static void main(String[] args)
	{
	  Thread t1 = Thread.currentThread();
	  System.out.println("Name" + t1.getName());
	  t1.setName("INITIATOR");
	  System.out.println("Name" + t1.getName());
	  
	  }
}
