class A <T>
{
	T obj;
}
class M58
{
	public static void main(String[] args) 
	{
		A<Integer> a1 = new A<Integer>();//we need to specify both side
	//reference is integer     //object is also integer//we are specifying here T as a integer
		a1.obj = 1000;//for this if left side is string and right side also string
		System.out.println("done");
	}
}
