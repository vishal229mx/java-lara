class U  
{
	public static void main(String[] args) 
	{
		System.out.println("main-begin");
		for(int i = 1,j = 50,k = 100;
		i <= 10 || j >= 1 || k >= 90;    // comma is not used 
		i++, j -= 4 , k -= 2 , i += 2)  //any number of changes with commma as separator 
		{
			System.out.println("loop body : " + i + " , " + j + " , " + k);
		}
		System.out.println("main end");
	}
}
// it is allow to put multiple boolean condition with using "and" and "or" symbol(commos (,) are not used in boolean condition)
//only first and third portion allow , (comma)