class Z2 
{
	public static void main(String[] args) 
{
		String s1 = "abc;xyz;123;hello;test";
		String[] splits = s1.split(";");
		for(String split : splits)
	{
		System.out.println(split);
	}
}
}
