class V
{
	int i;
	public static void test(V v1, V v2) 
	{ 
		System.out.println("test:" + v1.i + "," + v2.i);
		v1.i=v1.i + v2.i;   // v1.i=30      //swapping 
		v2.i=v1.i - v2.i;   // v2.i=10
		v1.i=v1.i - v2.i;   // v1.i=20 
		}

     public static void main(String[] args) 
	{ 
		 V ref1 = new V();
		 V ref2 = new V();
		 ref1.i = 10;
		 ref2.i = 20;
		 System.out.println("main1:" + ref1.i + "," + ref2.i);
		 test(ref1,ref2);
         System.out.println("main:" + ref1.i + "," + ref2.i);
		}
}

