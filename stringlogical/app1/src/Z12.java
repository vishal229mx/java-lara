class Z12 
{
	public static void main(String[] args) 
	{
		String s1 = "java";
		String s2 = new String("java");
		String s3 = new String("java");
		System.out.println(s1 == s2 );
		System.out.println(s1 == s3 );
		System.out.println(s2 == s3 );
	}
}
