class J
{
	public static void main(String[] args) 
	{
		int x=10;
		int y=x-- + x-- + x-- + x-- + x-- + x-- + x;
		    //10    9      8    7      6     5    4
			//System.out.println(--i);
			System.out.println(x);//4
			System.out.println(y);//49
	}
}
