abstract  final class A 
{
}
class B extends A
{
}
class M8
{
	public static void main(String[] args) 
	{
      System.out.println("done");
	}
}
//abstract class should have a sub class to implement further
//and final class should not have a sub class
//so using both final and abstract to class is illegal

//final is used for avoiding/restricting specialization..not allowing reinitiallization, overriding and subclass



/*

M8.java:1: error: illegal combination of modifiers: abstract and final
abstract  final class A
                ^
M8.java:4: error: cannot inherit from final A
class B extends A
                ^
2 errors
*/
