class Z1  
{
	public static void main(String[] args) 
	{
		System.out.println("main-begin");
		for(int i = 1;i <= 10;i++)
		{
			System.out.println("loop body : " + i );
			if(i == 5)
			{
				System.out.println("if block:" + i);
				break;
			}
			System.out.println("loop end:" + i);
		}
		System.out.println("main end:");
	}
}
//whenever break is applied it is coming away out of loop
//break and continue should be the last statemnet of current block
//we cannot use break and continue in the same block
//continue means it is not bothering about the current iteration..and move to the next iteration