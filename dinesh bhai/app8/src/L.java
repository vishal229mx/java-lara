class L  
{
	public static void main(String[] args) 
	{
		System.out.println("main-begin");
		int i = 20;                    
		for(;i <= 70;i += 10)   
		{
			System.out.println("loop body");
			System.out.println("loop body:" + i);
			System.out.println("----------------");
		}
		System.out.println("main-end : " + i); 
	}
}
// all three portion of for loop header are optional
