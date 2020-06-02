abstract class A
{
	abstract final void test1();
}  
class M2
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//we cannot define method as both abstract and final 
//abstract means it shhould implement in the sub class 
//and final means it should not be implemet in the sub class

/*


M2.java:3: error: illegal combination of modifiers: abstract and final
        abstract final void test1();
                            ^
1 error
*/