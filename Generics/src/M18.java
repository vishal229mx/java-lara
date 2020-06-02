class A<X extends R>
{
	X obj;
}
public class M18 
{
	public static void main(String[] args) 
	{
		A<P> a1 = new A<P>();
		A<Q> a2 = new A<Q>();
		System.out.println("done");
	}
}
//CTE

//while creating objects of A class we have to supply R or sub class of R only