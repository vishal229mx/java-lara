class Z10
{
	public static void main(String[] args) 
    {
		String s1 = "abc";
		System.out.println(s1);
		s1.concat("hello");//compile success bt this concat is not assigned to s1 value of s1 doesnot changed
		System.out.println(s1);
    }
}