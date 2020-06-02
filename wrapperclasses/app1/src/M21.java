class M21
{
	static void  test1(Integer obj)
	{
		System.out.println("test1(Integer)");
	}
	public static void main(String[] args) 
	{
		byte b1 = 10;
		test1(b1);
		System.out.println("done");
	}
}
//byte primitive cannot be converted to integer Object
/*

M21.java:10: error: incompatible types: byte cannot be converted to Integer
                test1(b1);
                      ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get
full output
1 error

*/