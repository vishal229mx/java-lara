class A
{
}
class M10 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		a2 = a1; //while calling this second object is becoming abondant                                                                                                            
		System.out.println("done");
	}
}
