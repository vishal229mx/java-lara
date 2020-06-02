class M39 
{
	public static void main(String[] args) 
	{
		A b1 = new B();
		b1.test1();
		System.out.println(b1.i);
	    //b1.test2();
		//System.out.println(b1.j);
	    B b2 =b1;//we cannot assign b1 to b2 it needs downcasting
		b2.test2();
		System.out.println(b2.j);
	}
}
/*


M39.java:10: error: incompatible types: A cannot be converted to B
            B b2 =b1;
                  ^

*/