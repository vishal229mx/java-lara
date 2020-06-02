class A
{
	int i;
	A(int i)
	{
		this.i = i;
	}
}
class M1 
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		A a2 = new A(90);
		System.out.println(a1.equals(a2));
	}
}
//equals method of object class internally using equals operator
//it is not comparing a1.i and a2.i it is comparing a1 and a2;