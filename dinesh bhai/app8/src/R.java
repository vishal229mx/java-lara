class R  
{
	public static void main(String[] args) 
	{
		System.out.println("main-begin");
		for(int i = 1,j = 50;i <= 10 && j>= 1 ; i ++, j -= 4)   
		{
			System.out.println("loop body : " + i + " , " + j);
		}
		System.out.println("main end");
	}
}
// it is allow to put multiple boolean condition with using "and" and "or" symbol(commos (,) are not used in boolean condition)
//only first and third portion allow , (comma)