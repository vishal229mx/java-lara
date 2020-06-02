class M34 
{
	public static void main(String[] args) 
	{
		Test.method2(new A());
		System.out.println("--------------");
		Test.method2(new B());
		System.out.println("--------------");
		Test.method2(new C());
		System.out.println("--------------");
		Test.method2(new D());
		System.out.println("--------------");
		Test.method2(new E());
		System.out.println("--------------");
		Test.method2("abc");
		System.out.println("--------------");
	}
}


/*


able to cast into A type
--------------
able to cast into A type
able to cast into B type
--------------
able to cast into A type
able to cast into B type
able to cast into C type
--------------
able to cast into A type
able to cast into B type
able to cast into C type
able to cast into D type
--------------
able to cast into A type
able to cast into B type
able to cast into C type
able to cast into D type
able to cast into E type
--------------
--------------
*/