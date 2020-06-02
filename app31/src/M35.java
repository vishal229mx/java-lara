class M35 
{
	public static void main(String[] args) 
	{
		C c1 = new D();
		System.out.println(c1 instanceof Object);
		System.out.println(c1 instanceof A);
		System.out.println(c1 instanceof B);
		System.out.println(c1 instanceof C);
		System.out.println(c1 instanceof D);
		System.out.println(c1 instanceof E);
		System.out.println(c1 instanceof String);
	}
}


/*
//Instanceof--->>it is only for one inheritance classes.
//it should not be used across the inheritance.
//c1 is a type of C



M35.java:12: error: incompatible types: C cannot be converted to String
                System.out.println(c1 instanceof String);
                                   ^
1 error
*/