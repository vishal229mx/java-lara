class Z9
{
	public static void main(String[] args) 
    {
		String s1 = "abc";
		System.out.println(s1);
		s1 = s1.concat("hello");//instead of using + operator we can also use concat method it is same as + operator
		System.out.println(s1);
    }
}
//concat method internally using + operator