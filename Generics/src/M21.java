class A<X extends Number>
{
	X obj;
}
public class M21 
{
	public static void main(String[] args) 
	{
		A<String> a1 = new A<String>();
		A<Thread> a2 = new A<Thread>();
		System.out.println("done");
	}
}