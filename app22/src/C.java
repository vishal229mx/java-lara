class C
{
	C()
	{
	   System.out.println("C()");
	}

	{
	   System.out.println("C-IIB");
	}

	C(int i)
	{
	   System.out.println("C(int)");
	}

	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("--------");
	    C c2 = new C();
		System.out.println("--------");
	    C c3 = new C(10);
		System.out.println("--------");
	    C c4 = new C(10);
		System.out.println("--------");
	}
}
//for every object iib block executes seccessfully without fail no matter what type of constructor is 