class M29 
{
	public static void main(String[] args) 
	{
		Object obj = new C();
		System.out.println(obj instanceof Object);//instanceof is a boolean operator ((here it checks the object refer by obj))
		System.out.println(obj instanceof A);
		System.out.println(obj instanceof B);
		System.out.println(obj instanceof C);
		System.out.println(obj instanceof D);
		System.out.println(obj instanceof E);
	}
}


/*


true
true
true
true
false
false
*/