class G         //all super class members aree inheriting to sub class either static or non static
{
	int i;
	static int j;
    void test1()
	{
       System.out.println("G.test1()");
    }
    static void test2()
	{
       System.out.println("G.test2()");
    }
}
class H extends G
{
	int m;
	static int n;
	void test3()
	{
	  System.out.println("H-test3()");
	}
	static void test4()
	{
       System.out.println("H.test4()");
    }

	public static void main(String[] args) 
	{
		H h1 = new H();
		System.out.println(h1.i);
		System.out.println(h1.m);
		System.out.println(H.j);
		System.out.println(H.n);
		h1.test1();
		h1.test3();
		H.test2();
		H.test4();
		
	}
}
//sib,iib,constructor will not be inherited to sub class....they are not surviving in the sub class