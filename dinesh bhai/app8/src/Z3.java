class Z3  
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
				continue;                           //continue should be the last statemnt of that block
				System.out.println("something"); //error
			}
			System.out.println("loop end:" + i);
		}
		System.out.println("main end:");
	}
}
//compile time error