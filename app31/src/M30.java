class M30 
{
	public static void main(String[] args) 
	{
		Object obj = new E();
		System.out.println(obj instanceof Object);
		System.out.println(obj instanceof A);
		System.out.println(obj instanceof B);
		System.out.println(obj instanceof C);
		System.out.println(obj instanceof D);
		System.out.println(obj instanceof E);
	}
}


/*
if instance of retruning true then no need of downcasting

true
true
true
true
true
true
*/