class O
{
	public static void main(String[] args) 
	{
		try //try should have a exception related to class not found exception 
		{
			int i=10;
			System.out.println(i);
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println(ex);
		}
		
	}
}
