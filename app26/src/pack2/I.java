package pack2;
import pack1.A;
class I
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.x);
		System.out.println(a1.y);
		System.out.println(a1.z);
	}
}
//protected and default cannot used outside of current package thats why compile time error