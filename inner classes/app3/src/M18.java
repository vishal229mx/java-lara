class M18 
{
	public static void main(String[] args) 
	{
		E e1 = new E();
		e1.method1(new A()
		          {
			          void test1()//overridig test method of A class through E class arg
					  {
                           System.out.println("from A.AIC.test1");
					  }
		          });
		System.out.println("done");
	}
}
//here we understand that whichever mehtod we want to override we can override in any mthod or class by calling anonymous method