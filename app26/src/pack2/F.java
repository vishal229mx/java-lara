package pack2;
class F
{
	public static void main(String[] args) 
	{
		pack1.A a1 = new pack1.A();
		System.out.println("done");
	}
}
//while using 1 class to other package 2 condns applied
//1. the accesed class should be public in this ex.for accesing A class we have to make A class public  
//public class only allow to use in other package
 
//2. while using in another package we have to use either package name or import___here we are using pack.A