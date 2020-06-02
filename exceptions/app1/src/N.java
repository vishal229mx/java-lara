class N 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		M obj = new M();
		obj.test();                //java.lang.NoSuchMethodError
		System.out.println("main end");
	}
}
//error bcoz in M class there is no test method bcoz commented and this error occured
