class A 
{
	static
	{
	    System.out.println("A-SIB");
	}
}
    class W extends A
    {
		static
		{
			System.out.println("W-SIB");
		}
	public static void main(String[] args) 
	{  
		System.out.println("W-main");
	}
}
//in this W sub class is not loadig A super class