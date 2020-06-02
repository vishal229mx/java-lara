class H
{
	public static void main(String[] args) 
	{
		int x=10;
		int y=x-- + x + x-- + x + x-- + x + x-- + x;
		    //10    9    9    8    8    7    7     6
			//System.out.println(--i);
			System.out.println(x);//6
			System.out.println(y);//64
	}
}
