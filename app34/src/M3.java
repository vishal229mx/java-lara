abstract class A
{
	static abstract void test1();
}  
class M3
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//static mehtod means not modifying further and abstract means modify further 
//so using both with each other is illegal


/*

M3.java:3: error: illegal combination of modifiers: abstract and static
        static abstract void test1();
                             ^
1 error

*/