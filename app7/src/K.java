class K
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	    	int i = 0;
		 if(i++ == 1){
	
             System.out.println(" if-block-stmt1");
			 i = i + 2;
		 }
	
	else
		{
			
		
          	System.out.println("else-block-stmt1");
		     i = i + 3;
		}
System.out.println("main end:" + i );

}
}