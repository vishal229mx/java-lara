class G 
{
	class B
	{
	}
	static class C
	{
	}
	public static void main(String[] args) 
	{
		B b1 = new G().new B(); 
		C c1 = new G.C();//we can directly use class name with static class//here we are not creating obj to G only use G class to refer C class name
		System.out.println("done");
	}
}

