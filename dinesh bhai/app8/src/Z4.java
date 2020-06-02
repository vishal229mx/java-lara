class Z4  
{
	public static void main(String[] args) 
	{
		System.out.println("main-begin");
		for(int i = 1;i <= 10;i++)
		{
			System.out.println("loop begin : " + i );
			if(i == 5)
			{
				System.out.println("if block:" + i);
				break;                           
				continue;     //break and continue should be the last statement in the current file
			}
			System.out.println("loop end:" + i);
		}
		System.out.println("main end:");
	}
}
//we cannot put break and continue in the same block
