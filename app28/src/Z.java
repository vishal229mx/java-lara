class A 
{
     void test(int i)
	{
        System.out.println("A.test(int)");
	}
}
class B extends A
{
    void test(int j)//overriding bcoz same sigature i.e. same no of datatype and arg
	{
        System.out.println("B.test(int)");
	}
}
class Z
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test(20);
		System.out.println("done");
	}
}
//A class test method not available inside B