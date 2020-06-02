class A<X extends R>
{
	X obj;
}
public class M17 
{
	public static void main(String[] args) 
	{
		A<R> a1 = new A<R>();
		A<S> a2 = new A<S>();
		A<T> a3 = new A<T>();
		System.out.println("done");
	}
}
//it is not 100% generic.. its only generic to R class or subclass of R class