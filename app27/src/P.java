abstract class A 
{
 A()
 {
    	System.out.println("A()");
 }
}
abstract class B extends A
{
	B()
	{
		System.out.println("B()");
	}
}
class C extends B
{

}

class P
{
	public static void main(String []args)
	{
		C c1 = new C();
		System.out.println("done");
		}
}
//every class should have atleast constructor includes abstract class...
//in abstract class we can develop any no. of constructors
