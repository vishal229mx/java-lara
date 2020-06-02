class Z2  
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
				break;                           //break should be the last statemnt of that blocl
				System.out.println("something"); //error
			}
			System.out.println("loop end:" + i);
		}
		System.out.println("main end:");
	}
}
//In any block,break and continue should be the last statemnt ...after break sop is there hence error
//break and continue is only for the loops(for,while,do..while)