class A 
{
  void test()
  {
    	System.out.println("A.test()");  
  }
}
class T extends A
{
	int test()
	{
		System.out.println("from subclass.test()");
		return 10;
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
//same signature attempting to override bt not possible bcoz not same return type