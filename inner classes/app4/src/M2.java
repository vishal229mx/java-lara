interface A //it is also called functional interface
{
	void test();
} 
class M2
{
	public static void main(String[] args) 
	{
		A a2 = () -> {
		                  System.out.println("from test");   
		                  System.out.println("from test");   
		                  System.out.println("from test");   
					 };
		a2.test();
	}
}
//for multiple line of sop we use brackets
//single meethod interface is also called functional interface

//marker/marked interface ==>> thosse interfaces are empty
