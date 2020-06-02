class M18 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		B b1 = (B)a1;//compilation is successful bcoz of compiler checks left side data type and right side
		System.out.println("done");

//bt after running it checks the original obj i.e. A that cant be converted to B so that class cast exc. occurs
	}
}
