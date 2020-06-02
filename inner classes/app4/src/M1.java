//in JDK 1.8 lambda expressions are introduced
interface A
{
	void test();
} 
class M1
{
	public static void main(String[] args) 
	{
		A a1 = new A()
		{
			public void test()
			{
				System.out.println("from test");
			}
		};
		a1.test();
		System.out.println("----------------");

		A a2 = () -> System.out.println("from test");//()=>mehtod ->"to declare a method"
		a2.test();
	}
}

//lambda expression is only for single method interface
//"() -> sop" this is lambda expression

//if multiple methods are there in the interface you cannot use lambda expression ... only for single method interface