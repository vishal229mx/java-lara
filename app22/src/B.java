class  B
{
	B()
	{
	   System.out.println("A()");
	}

	{
	   System.out.println("B-IIB");//iibs are executing for every object creating
	}

	B(int i)
	{
	   System.out.println("B(int)");
	}

	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("--------");
	    B b2 = new B(20);
		System.out.println("--------");
	}
}
