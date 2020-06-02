class E implements Cloneable 
{
	int i;
	String s1;
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		E obj1 = new E();
		obj1.i = 90;
		obj1.s1 = "abc";

        E obj2 = (E) obj1.clone();
		System.out.println(obj2.i);
        obj2.i = 190;
        obj2.s1 = "xyz";
		System.out.println(obj1.i);
		System.out.println(obj1.s1);
	}
}
//if changes reflected to another object is shallow copy
//if attribute are primitive or immutable then we willl getdeep copy -like string