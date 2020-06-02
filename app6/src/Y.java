class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
	    if(i++ == 0 || i++ == 1)
	
		{
		 System.out.println("if1-begin:" + i++ );	
		 if(i++ == 2 || i++ == 3)
        
		{
			 System.out.println("if2-begin:" + i++ );		
             System.out.println("if2-end" );
		    
		 }
		 System.out.println("if1-end:"+ i++ );
			 }
		
	
	System.out.println("main end:"+ i  );
	}
}