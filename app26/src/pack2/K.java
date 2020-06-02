package pack2;
import pack1.A;
class K extends A
{
	public static void main(String[] args) 
	{
		K k1 = new K();
		System.out.println(k1.x);
		System.out.println(k1.y);
		System.out.println(k1.z);
	}
}
//we use ref of current class and package thats why protected member of other package is compiled
// bt default member cannt be inherited in other package.. default only limited to current package