class M21 
{
	public static void main(String[] args) 
	{
		G.method1(new D()
		         {
			          public void test1()
					  {
                           System.out.println("from test1");
					  }
		              public void test2()
					  {
                           System.out.println("from test2");
					  }
		         });
		System.out.println("Hello World!");
	}
}
