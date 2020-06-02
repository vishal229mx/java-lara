abstract class A 
{
	 void test1() 
	{
		
	}
	abstract void test2();
}
class G
{
	public static void main(String []args)
	{
		A a1 = new A();             //we cannot create an obj of abstract class
		System.out.println("done");
	}
}