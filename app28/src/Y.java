class A 
{
     void test()
	{
        System.out.println("A.test()");
	}
}
class B extends A//inherited mehtod get overridded
{
    void test()
	{
        System.out.println("B.test()");
	}
}
class Y
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test();
		System.out.println("done");
	}
}
//abstract mehtod should be overrided in the subclass
//A class test method is not availabel in the B class ...
//A class overrided in B or replaced in B...
//same signature get replaced or overriding different signature overloading
//only B class test mthod availabele
//