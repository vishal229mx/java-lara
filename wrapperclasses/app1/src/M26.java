class M26
{
	static void  test(int ... args)//var args introduced in jdk1.5
	{
		System.out.println("var arg");
	}
	public static void main(String[] args) 
	{
		test();
		test(1);
		test(2,4);
		test(40 , 10);
		System.out.println("done");
	}
}

//if arg is var arg .. method can receive any no of arguments