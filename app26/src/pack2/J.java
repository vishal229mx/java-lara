package pack2;
import pack1.A;
class J extends A
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.x);
		System.out.println(a1.y);
		System.out.println(a1.z);
	}
}
//x cannot be inherited to sub classes of another package// default member can be inherited to sub class of same package
//& y can be bt we are getting same compile time error bcoz after inheriting protected member from other package the ref should be of current package n class.
