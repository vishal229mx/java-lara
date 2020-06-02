class M44 
{
	public static void main(String[] args) 
	{
		A a1 = new C();
		C c1 = new C();
		System.out.println(a1.i);
		if (a1 instanceof C)
		{
			C obj = (C) a1;
			System.out.println(obj.j);
		    System.out.println(obj.k);
		}
		System.out.println(c1.i);
	    System.out.println(c1.j);
	    System.out.println(c1.k);
	}
}

/*
//up casting restricts us to use all members so that we use downcasting and for that we are advisable to use instance of


0
0
0
0
0
0
*/