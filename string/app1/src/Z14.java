class Z14 
{
	public static void main(String[] args) 
	{
		String ja = "ja";
		String va = "va";
		String s1 ="java";
		String s2 =new String("java");
		String s3 =new String("java");
		String s4 = ja.concat( va);  //both are refrence
		String s5 = ja.concat("va");  //ja is refrence
		String s6 = "ja".concat( va);
		String s7 = "ja".concat("va");  
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1==s4);
		System.out.println(s1==s5);
		System.out.println(s1==s6);
		System.out.println(s1==s7);
        System.out.println("================");
		System.out.println(s2==s3);
		System.out.println(s2==s4);
		System.out.println(s2==s5);
		System.out.println(s2==s6);
		System.out.println(s2==s7);
		System.out.println("================");
        System.out.println(s3==s4);
		System.out.println(s3==s5);
		System.out.println(s3==s6);
		System.out.println(s3==s7);
        System.out.println("================");
		System.out.println(s4==s5);
		System.out.println(s4==s6);
		System.out.println(s4==s7);
        System.out.println("================");
		System.out.println(s5==s6);
		System.out.println(s5==s7);
		System.out.println("================");
		System.out.println(s6==s7);
	}
}
/*
    always creating a new object when we are using a .concat() but 
	when we  using +  operator not creating new object

 */