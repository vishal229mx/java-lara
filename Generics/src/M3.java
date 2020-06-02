class A
{
	String obj;;
}
public class M3 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.obj = "hello";
		
		A a2 = new A();
		a2.obj = "test";
		System.out.println("done");
	}
}

//for every object of B data type of obj is same, we cant change the attribute data types
//from one obj to another obj