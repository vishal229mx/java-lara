class A 
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	void performClone()
	{
		A a2 = clone();
		System.out.println(a2.i);
	}
}
class M2 
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		a1.performClone();
		System.out.println("done");
	}
}
//we cannot assign clone() return to A type straight away we will get CTE