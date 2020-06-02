/*
Q.
    98765
	87654
	76543
	65432
	54321
	43210
	*/



class PAT
{ 
	public static void main(String[] args) 
	{
		
		for (int i = 9;i >= 4 ;i--)
		{
			
			
					for (int j=9,k=i;j>=5 ;j--,k--)
				{
				  System.out.print(k);
				  
				}
				System.out.println();
			
		}
		
	}
}
