class C 
{
	static void test(int i)
	{
		if (i == 11)
		{
			return;
		}
		System.out.println("Hello World!");
		i++;
		test(i);
	}
	public static void main(String[] args) 
	{
		test(1);
	}
}
//recursion 

//1.  static void test(int i)  ==>> declare method

/* 2.
        if (i == 11)
		{
			return;
		}              ==>> condition to get out of recursion
*/
//3.  i++;
//    test(i);    ==>>  increment and calling