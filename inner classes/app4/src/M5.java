interface A
{
	void test(int i, double j);
} 
class M5
{
	public static void main(String[] args) 
	{
		A a2 = (x,y) -> {  //here if only one method, so thats why we dont need to specifying data type of arg
		                  System.out.println("from test" + x);   
		                  System.out.println("from test" + y);   
		                  System.out.println("from test");   
					  };
		a2.test(20, 3.4);
	}
}
