class Q
{
	int i;
	public static void test(Q arg) 
	{ 
		arg.i =20;
		System.out.println("test:" + arg.i);
		}

     public static void main(String[] args) 
	{ 
        Q ref1 = new Q();
		ref1.i=10;
		System.out.println("main:" + ref1.i);
		test(ref1);
		System.out.println("main:" + ref1.i);
		}
}


//for 1 class we can create any no. of objects
//1 obj can be reffered by any no. of variables