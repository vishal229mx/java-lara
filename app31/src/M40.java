class M40
{
	public static void main(String[] args) 
	{
		A b1 = new B();//if upcasting is not there program is very simple for that we use downcasting and instanceof
		b1.test1();
		System.out.println(b1.i);
	    //b1.test2();
		//System.out.println(b1.j);
	    if(b1 instanceof B)
		{
			B b2 =(B)b1;
			b2.test2();
			System.out.println(b2.j);
		}
	}
}
/*
bcoz of upcasting we cant use all members of object

from A.test1()
0
from B.test2()
0
*/