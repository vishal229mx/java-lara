class A <X>
{
	X obj;
}
public class M11 
{
	public static void main(String[] args) 
	{
		A<Integer> a1 = new A<Integer>();
		A<String> a2 = new A<String>();
		A<Double> a3 = new A<Double>();
		A a4 = new A();
		a1.obj = 40;
		a2.obj = "abc";
		a3.obj = 4.6;
		a4.obj = new Object();
		System.out.println("done");
	}
}
//for a4 its comes under Object type