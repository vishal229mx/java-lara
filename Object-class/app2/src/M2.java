class A
{
	int i;
	A(int i)
	{
		this.i = i;
	}
}
class M2
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		A a2 = a1;
		System.out.println(a1.equals(a2));
	}
}

//if a1 and a2 both are binding to same object then double equals operator 