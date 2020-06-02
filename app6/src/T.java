class T
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	     int i = 0;
	
		{
		 System.out.println("if block stmt1:" + i );
		 i = 10;
		 
         System.out.println("ifblock stmt2" );
		 System.out.println("if block stmt3");
		 }
		{
			 System.out.println("if block stmt1:" + i);		
             System.out.println("ifblock stmt2" );
		     System.out.println("if block stmt3");
		 }
		
	
	System.out.println("main end:"  );
	}
}