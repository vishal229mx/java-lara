class M2 
{
	public static void main(String[] args) 
	{
		A a1 = null;
		A a2 = null;
		a1 = a2;
		Object obj1 = null, obj2 = null;
		obj1 = obj2;
        C c1 = null;
		C c2 = c1;
        D d1 = null , d2 = new D();
		d1 = d2;
        E e1 = new E() , e2 = new E();
        e2 = e1;
		System.out.println("done");
	}
	//here assignments value is same for all i.e. left hand side data type is same as right hand side
}
