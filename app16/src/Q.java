class Q
{
	    static int x =100;
		public static void main(String [] args) 
	{
		System.out.println("main1:" + x);
		int x =500;           
		System.out.println("main2:" + x);
		System.out.println("main3:" + Q.x);//if class name is with variable then global is consider not local
	}
}