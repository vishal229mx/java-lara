package pack1;
class D
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.x);
		System.out.println(a1.y);
		System.out.println(a1.z);
	     C c1 = new C();
		System.out.println(c1.x);
		System.out.println(c1.y);
		System.out.println(c1.z);
	}
}
//default scope/ variable/members is also known as pakage scope..bcoz default varible x can be used throughout the same pakage or used  
//throughout the sub classes of same class---->thats why it is also known as pakage


//protected members is also used in current pakage... protected member keep inheriting to any subclass within the same pakages or different pakage

//public can be used any where and inherited to any sub class in any pakage