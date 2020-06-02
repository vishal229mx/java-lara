class J
{
	static int x;
	static double x;//under one scope 2 variable should not have a same name
	public static void main(String [] args) 
	{
		System.out.println(x);
	}
}