abstract class  D
{
	public static void test() 
	{
		System.out.println("test()");
	}
	int test(int i) 
	{
		System.out.println("test(int)");
	    return 20;
	} 
    abstract boolean test(double i);
}
//in case of overloading--if same name and different signature then it can be while overloading