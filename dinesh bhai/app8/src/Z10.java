class Z10  
{
	public static void main(String[] args) 
	{
		System.out.println("main-begin");
		for(int i = 1;i <= 10;i++);
		{
			System.out.println("loop begin:" + i );  //i is local to i ..compile time error 
			System.out.println("loop end:"); 
		}
		System.out.println("main end:");
	}
} 