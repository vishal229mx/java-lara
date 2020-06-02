class M14 
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println("Hello World!");
	}
}

//we cannot create an object to interface bcoz it is pure abstract
/*

M14.java:5: error: D is abstract; cannot be instantiated
                D d1 = new D();
                       ^
1 error
*/