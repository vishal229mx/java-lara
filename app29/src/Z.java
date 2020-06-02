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
class Q extends P
{
	A test()
	{
		return null;
	}
}
class Z
{
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}