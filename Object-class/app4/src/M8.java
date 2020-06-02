class A
{
}
class  M8
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = a1;
		A a3 = a2;
		a2 = null;
		a3 = null;
		a1 = null; //at this point...when last ref is removing then obj is becoming abondant
		System.out.println("done");
	}
}
//obj is abondant