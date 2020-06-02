class M16
{
	public static void main(String[] args) 
	{
		D d1 = new D()
		{
		    public void test2()
			{
				System.out.println("from test2");
			}
		};
		d1.test2();
		System.out.println("done");
	}
}



/*

M16.java:6: error: <anonymous M16$1> is not abstract and does not override abstr
act method test1() in D
                {
                ^
1 error
*/