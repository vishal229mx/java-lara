class F 
{
	public static void main(String[] args) 
	{
		final int[] x = new int[3];
		x[2] = 20;
		System.out.println("done");
	}
}
//here we only changing index value not value of x that is final so compile successs