class M8 
{
	public static void main(String[] args) 
	{
		B b1 = new B()
		{
			{
				System.out.println("AIC-IIB");
			}
		};
		b1.test1();
		System.out.println("done");
	}
}
//we can create a IIB,SIB bt not constructors
//in the body of inner class we cannot develop a new constructor bcoz anonymous inner class doesnt have a name and constructor req class name