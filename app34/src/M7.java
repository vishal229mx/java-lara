final class A 
{
}
class B extends A
{
}
class M7
{
	public static void main(String[] args) 
	{
      System.out.println("done");
	}
}
//class also can be final
//if class is a final it cannot develop a subclass


/*

M7.java:4: error: cannot inherit from final A
class B extends A
                ^
1 error
*/