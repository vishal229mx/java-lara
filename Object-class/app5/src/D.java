class D implements Cloneable 
{
	int i;
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		D obj1 = new D();
		obj1.i = 90;

        D obj2 = (D) obj1.clone();
		System.out.println(obj2.i);
        obj2.i = 190;
		System.out.println(obj1.i);
	}
}
//changes in the duplicate not reflecting to original and changes to original not reflecting to duplicate 
//this type of cloning  is deep copy cloning...