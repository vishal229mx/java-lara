interface A
{
	void test(int i);
} 
class M4
{
	public static void main(String[] args) 
	{
		A a2 = (x) -> {  //here if only one method, so thats why we dont need to specifying data type of arg
		                  System.out.println("from test" + x);   
		                  System.out.println("from test");   
		                  System.out.println("from test");   
					  };
		a2.test(20);
	}
}
