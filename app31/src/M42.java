class M42 
{
	public static void main(String[] args) 
	{
		B b1 =new D();
		System.out.println(b1.i);
		System.out.println(b1.j);
		if (b1 instanceof D)
		{
			D d1 = (D) b1;
            System.out.println(b1.k);
		    System.out.println(b1.l);
		}
		
	}
}

/*

M42.java:11: error: cannot find symbol
            System.out.println(b1.k);
                                 ^
  symbol:   variable k
  location: variable b1 of type B
M42.java:12: error: cannot find symbol
                    System.out.println(b1.l);
                                         ^
  symbol:   variable l
  location: variable b1 of type B
2 errors

*/