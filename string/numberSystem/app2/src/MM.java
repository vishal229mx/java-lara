class MM 
{
	public static void main(String[] args) 
	{
		int n = 123456, half = 3;
		int count = 1, var1 = 0, var2=0, inc=1, rev=0;
		while (n != 0)
		{
			if (count <= half)
			{
				int a = n%10;
				var1 = inc * a;
				var2= var2 + var1;
				inc = inc * 10;
				n = n/10;
			}
			else
			{
			  int a = n%10;
			  rev = rev * 10 + a;
			  n = n/10;
			}
			count ++;
		}
		System.out.println(rev + "" + var2);
	}
}
