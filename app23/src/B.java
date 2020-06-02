class A      //A==super class
{
  int i;
}
class B extends A   //B==sub class   sub class developed based on super class or B is depending on A
{
	int j;
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
