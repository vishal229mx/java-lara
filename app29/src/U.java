class A 
{
  void test()
  {
    	System.out.println("A.test()");  
  }
}
class U extends A
{
	public void test()
	{
		System.out.println("from subclass.test()");
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
//while over riding access level should be same or wider(wider than subclass)