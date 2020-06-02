class M40
{
	public static void  test(Integer b1) 
	{
		System.out.println("Integer");
	}
	public static void main(String[] args)
    {
		byte b1 = 10;
		test(b1);
	}
}
//byte cannot be converted to Integer 



 /*
 
 
 M40.java:10: error: incompatible types: byte cannot be converted to Integer
                test(b1);
                     ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get
full output
1 error

 */