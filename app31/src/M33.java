class M33 
{
	public static void main(String[] args) 
	{
		A  a1 = new C();
		if(a1 instanceof B)
		{
			B b1 = (B) a1;
			System.out.println("converted to B type");
		}
		if(a1 instanceof C)
		{
			C c1 = (C) a1;
			System.out.println("converted to C type");
		}
		if(a1 instanceof D)
		{
			C c1 = (C) a1;
			System.out.println("converted to D type");
		}
		System.out.println("done");
	}
}

/*
//where ever we use downcasting advisable to use instanceof 


converted to B type
converted to C type
done
*/