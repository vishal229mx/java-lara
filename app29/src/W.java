class A 
{
   void test()
  {
    	System.out.println("A.test()");  
  }
}
class W extends A
{
	static void test()
	{
		System.out.println("from subclass.test()");
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
//non static method cannot be overrided with static & static cannot be overrided with non static