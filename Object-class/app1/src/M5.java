class A
{
	int i;
	int j;
	A(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	public String toString()
	{
		return "(i = " + i + ", j = " + j + ")";
	}
}
class M5
{
	public static void main(String[] args) 
	{
		A a1 = new A(10,20);
		A a2 = new A(100,200);
		System.out.println(a1);
		System.out.println(a2);
	}
}
//every attribute of a class clearly described in the body of toString()
//while calling a1.toSting internally override toString()....
//every entity class override to toSting method

/*
(i = 10, j = 20)
(i = 100, j = 200)
*/




