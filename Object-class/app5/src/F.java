class A
{
	int x;
	A(int x)
	{
		this.x =x;
	}
}
class F implements Cloneable 
{
	int i;
	A a1;
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		F obj1 = new F();
		obj1.i = 90;
		obj1.a1 = new A(10);

        F obj2 = (F) obj1.clone();
		System.out.println(obj2.i);
		System.out.println(obj2.a1.x);
        obj1.i = 190;
        obj1.a1.x = 20;
		System.out.println(obj2.i);
		System.out.println(obj2.a1.x );
	}
}
//if object is containing any deriverd attributes then..
//object class clone() giving a shallow copy of clone method