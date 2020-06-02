class A 
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	void performClone()
	{
		A a2 = (A) clone();
		System.out.println(a2.i);
	}
}
class M3 
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		a1.performClone();
		System.out.println("done");
	}
}