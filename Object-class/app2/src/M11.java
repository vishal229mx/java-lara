class M11 
{
	public static void main(String[] args) 
	{
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s3.equals(s4));
	}
}
//inside string classs equals method overrided
//we are  gettin true if content is same