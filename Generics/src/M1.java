class A
{
	int i;
}
public class M1 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 10;
		
		A a2 = new A();
		a2.i = 30;
		System.out.println("done");
	}
}
//for every object  of A we have to assign only int values,, we can't assign any other data types 