class A 
{
 
}
class B extends A 
{
 
}
class C extends B 
{
 
}
class P
{
	B test()
	{
	return null;
	}
}
class Q extends P //if it is a derieved we can use subclass of B this is called covarient
{
	C test()  //co-varient (JDK 1.5)
 	{
		return null;
	}
}
class Y
{
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}