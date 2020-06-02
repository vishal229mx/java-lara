class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");  
		for(int i =1;i <= 5; i++)       //(initilization(only one time execute);boolean condition(every time check including 1st iteration);increment/decrement(from 2nd iteration))
		{
			System.out.println("loop-body:" + i );
		}
		System.out.println("main end");
	}
}
//first iteration will be with initial values..
