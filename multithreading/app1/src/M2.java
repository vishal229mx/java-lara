class M2 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 100 ; i++)
		{
			System.out.println(i);
		}
		for (int i = 200; i < 300 ; i++)
		{
			System.out.println(i);
		}
	}
}

//the complete processor time is allocated to main thread
//this is a sequential execution... single threaded program