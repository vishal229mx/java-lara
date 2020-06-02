class A
{
}
class M9 
{
	public static void main(String[] args) 
	{
		A a1 = null;
		String s1 = "some thing " + a1;
		System.out.println(a1);
		System.out.println(s1);
	}
}
//whenever ref is..null itself concatinating,, 
//if it all ref variable is a null then..toString methtod is not calling.
//if ref variable is other than null then it will call toString()