class A <T>
{
	T obj;
}
class M61
{
	public static void main(String[] args) 
	{
		A<Integer> a1 = new A<>(); 
		A a2 = new A();
		a1 = a2;
		a2 = a1;
		a1.obj = 1000;
		a2.obj = 1000;
		System.out.println("done");
	}
}


//JDK 1.5 generics

//ref of generic can be assign to non generic 
//interchangable