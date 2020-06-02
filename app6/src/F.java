class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		if(false)
		{
		   System.out.println("if block stmt1:" + i);		
           System.out.println("ifblock stmt2" );
			
			i=20;

		   System.out.println("if block stmt3");
	}
	      System.out.println("main end:" + i);
	}
}
