class M41 
{
	public static void main(String[] args) 
	{
		B b1 =new D();
		System.out.println(b1.i);
		System.out.println(b1.j);
		System.out.println(b1.k);
		System.out.println(b1.l);
	}
}

/*


M41.java:8: error: cannot find symbol
                System.out.println(b1.k);
                                     ^
  symbol:   variable k
  location: variable b1 of type B
M41.java:9: error: cannot find symbol
                System.out.println(b1.l);
                                     ^
  symbol:   variable l
  location: variable b1 of type B
2 errors
*/