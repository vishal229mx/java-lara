class A <X>
{
	void test(X obj)
	{
	}
}
public class M12 
{
	public static void main(String[] args) 
	{
		A<Integer> a1 = new A<Integer>();
		A<String> a2 = new A<String>();
		A<Double> a3 = new A<Double>();
		a1.test(10);
		a2.test("abc");
		a3.test(3.5);
		System.out.println("done");
	}
}