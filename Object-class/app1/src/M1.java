class A
{
	int i;
}
class M1 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 10;
		System.out.println(a1);
	}
}

//internally it is calling a1.toString... and it returning hexadecimal representation of memory address



