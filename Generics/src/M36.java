class A <X>
{
	void test(X obj)
	{
	}
}
class M36
{
	public static void main(String[] args) 
	{
		A < ? > a1 = null;
		a1 = new A<P>();
		a1.test(new P());

		A<Integer> a2 = null;
		a2 = new A<Integer>();
		a2.test(90);
		System.out.println("done");
	 }
}
