class A
{
}
class  M7
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = a1;
		A a3 = a2;
		a2 = a3 = null;
		System.out.println("done");
	}
}
//1 obj 1 ref