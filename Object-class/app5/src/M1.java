class A 
{
	int i;
	A(int i)
	{
		this.i = i;
	}
}
class M1  
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		A a2 = a1.clone();
		System.out.println("done");
	}
}
//even though M1 also containg clone().. bt we are using class A clone()
//bcoz clone() is protected...