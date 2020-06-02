class K
{
	static int x;
	public static void main(String[] args) 
	{
		System.out.println(x);//1
		System.out.println(K.x);//2
		K k1 = new K();
		System.out.println(k1.x);//3
	}
}
//static members can be used in 3 different ways
//1. if static member in same class
//2. if in other class .... we can use static member in other class also 
//3. use reference variable to use static variable ..... it replaces ref var. to class variable //System.out.println(k1.x);-->System.out.println(K.x);