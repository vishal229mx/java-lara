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
class B  //we are not extending A into B bt B has A so this is has-a relation
{
	int m;
	int n;
	A obj;
	B(int i, int j,int m, int n)
	{
		obj = new A(i, j);
		this.m = m;
		this.n = n;
	}
	public String toString()
	{
		return obj + ", m = " + m + ", n = " + n;  //whenever we are calling ref. toString method is calling by overriding we can change it to return state not address
	}
}
class M8
{
	public static void main(String[] args) 
	{
		A a1 = new A(10,20);
		A a2 = new A(100,200);
		String s1 = "state of a1: " + a1;
		String s2 = "state of a2: " + a2;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(s1);
		System.out.println(s2);

		B b1 = new B(10,20, 400 , 500);
		B b2 = new B(100,200,30,35);
		String s3 = "state of b1: " + b1;
		String s4 = "state of b2: " + b2;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
//while adding ref variable to string object to stirng is called