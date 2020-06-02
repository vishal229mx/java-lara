class C implements Cloneable 
{
	int i;
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		C obj1 = new C();
		obj1.i = 90;

        C obj2 = (C) obj1.clone();
		System.out.println(obj2.i);
        obj1.i = 190;
		System.out.println(obj2.i);
	}
}
