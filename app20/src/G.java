class G 
{
	 void test() 
	{
		System.out.println("from test");
	}

	public static void main(String[] args) 
	{
		G ref = new G();
		ref.test();
		System.out.println("done");
	}
}
