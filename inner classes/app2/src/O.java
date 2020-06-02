class O 
{
	public static void main(String[] args) 
	{
		int i = 10;
		final int j = 10;
		class A
		{
			void test()
			{
                System.out.println(i);
                System.out.println(j);
			}
		}
		i = 10;
		System.out.println("done");
	}
}
//while using local variables inside a local  inner class ,, local variable should act as a final


/*


O.java:11: error: local variables referenced from an inner class must be final o
r effectively final
                System.out.println(i);
                                   ^
1 error

*/
