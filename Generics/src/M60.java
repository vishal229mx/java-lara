class A <T>
{
	T obj;
}
class M60
{
	public static void main(String[] args) 
	{
		A<Integer> a1 = new A<>(); //JDK1.7   //we can also provide empty angle bracket it is also treating same as right hand side ojct as integer
		a1.obj = 2000;
		A<?> a2 = new A<>();//JDK1.7
		A<? extends Number> a3 = new A<>();//JDK1.7  //wild card extends,,,here it considers right hand side as number
		A<? super Number> a4 = new A<>();//JDK1.7
		System.out.println("done");
	}
}

//? -> we used this for objects...

//we can also use empty brackets 1.7 onwards