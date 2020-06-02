interface A
{
	void test1();
}
class K implements A
{
	public void test1()// it is mandatory to make interface mehtod in sub class "public" 
	{
		System.out.println("from K.A()");
	}
	public static void main(String [] args)
	{
		//A a1 = new A();
		A a2 = null;
		K k1 = new K();
		k1.test1();
	    System.out.println("done");
	}
}
//we cannot create an object on interface bcoz its 100% abstract
//but we can create an referance varible to the interface
//where ever data type is required we can use the interface

