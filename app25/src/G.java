class A
{
	private A()
    {
		System.out.println("A()");
	}
}
class G extends A
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
//constructor A is called by super class of G bt we cant call private member any where outside of current class
