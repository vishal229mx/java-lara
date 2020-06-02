class A 
{
	void test() 
	{
		System.out.println("from A.main");
	}
}
class Q extends A
{
	void test(int i)
	{
		System.out.println("from subclass.test(int)");
	}
	public static void main(String[] args) 
	{
		Q q1 = new Q();
		q1.test();
		System.out.println("done");
	}
}
//this is not overriding 
//this comes under overloading
//inherited mehtod got overloaded bcz difference in the signature