class Z19 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i =1;i <= 5; i++)
		{
			System.out.println("outer loop begin:" + i);
			xyz:                            //name of the loop is xyz
			for(int j = 10;j <=13 ; j++)
			{
				System.out.println("inner loop begin:" + i + " , " + j);
				if(j == 11)
				{
					break xyz;
				}
				System.out.println("inner loop end:" + i + " , " + j);
			}
			System.out.println("outer loop end" + i  );
			System.out.println("----------------------------" );
		}
		System.out.println("main end");
	}
}
//on the top of the loop you can give name to the loop using colon ..any name that should be valid identifier..
//that are called as labled loop or loop with a lable..
//while suing break and continue you can specify the name of the loop
