class S 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			int i = 10/0;
			System.out.println(2);
		}
		catch (NullPointerException ex)//Throwable
		{
			ex.printStackTrace();  //this returns full error message
		}
		System.out.println("main end");
	}
}
//rised exception is handeled bt flow is terminated bcoz error is not handeled 