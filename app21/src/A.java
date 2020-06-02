class  A
{
	A()   
	{
	   System.out.println("A()");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A a1 = new A();
		System.out.println("==========");
		A a2 = new A();
		System.out.println("main end");
	}
}
//constructor should have same class name
//constructor executes automatically while obj is created
//constructor dont have return type
//every class should have a minimum constructor