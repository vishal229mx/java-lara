class A
{
	int i;
}
class M2
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 10;
		A a2 = new A();
		a2.i = 20;
		System.out.println(a1);
		System.out.println(a2);
	}
}
//whenever we are printing reference is always returning memory representation
//we are not getting state(attribute values) of the object bt we are getting memory of the object

