class Z5  
{
	public static void main(String[] args) 
	{
		System.out.println("main-begin");
		for(int i = 1;i <= 10;i++)
			System.out.println("loop begin:" + i ); 
			System.out.println("loop end:" + i ); // i is local to for loop hence compile time error
		System.out.println("main end:");
	}
} //if no opning and closing bracket then only one statemnt comes in for loop body