class M32
{
	public static void  test(double ... y) 
	{
	}
    public static void  test(double[] z) //overloading is not happening bcoz of same signature
	{
	}
}


/*

M32.java:6: error: cannot declare both test(double[]) and test(double...) in M32

    public static void  test(double[] z)
                        ^
1 error
*/