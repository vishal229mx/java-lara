class A 
{
  protected void test()
  {
    	System.out.println("A.test()");  
  }
}
class V extends A
{
	void test()//dont use narrower access level 
	{
		System.out.println("from subclass.test()");
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}