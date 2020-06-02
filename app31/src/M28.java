class M28 
{
	public static void main(String[] args) 
	{
		Test.method1(new B());//if it all obj type is a B that cannot be down casting to C,D or E
		System.out.println("done");
	}
}


/*


Exception in thread "main" java.lang.ClassCastException: B cannot be cast to C
        at Test.method1(Test.java:5)
        at M28.main(M28.java:5)
*/