class M11 
{
	public static void main(String[] args) 
	{
		C c1 = new C()
		{
			void test2()
			{
				System.out.println("from AIC.test2()");
			}
		};
		c1.test1();
		c1.test2();
		System.out.println("done");
	}
}
//here we are not creating an object to C....we are creating an object to sub class of C i.e. anonymous class 

/*

from C.test1
from AIC.test2()
done
*/