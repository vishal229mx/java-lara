class R
{
	    static int x =100;
		public static void main(String [] args) 
	{
		System.out.println("main1:" + R.x);//static global varible try to use class name..always use global variable with class this avoid local variable
		System.out.println("main2:" + R.x);
		System.out.println("main3:" + R.x);
	}
}