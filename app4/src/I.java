class I
{
	public static void main(String[] args) 
	{
		int x=0;
		int y=x++ + x++ + x++ + x++ + x++ + x++ + x;
		  //  0     1     2     3     4     5    6
			//System.out.println(--i);
			System.out.println(x);//6
			System.out.println(y);//21
	}
}
