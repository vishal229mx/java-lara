class M22 
{
	public static void main(String[] args) 
	{
		B b1 = new C();
		C c1 = (C) b1;
		System.out.println("---------------");
		D d1 = (D) b1;
		System.out.println("---------------");
	}
}
//C obj is not a type of D it is only type of A,B,C