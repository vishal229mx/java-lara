class B  
{
	public static void main(String[] args) 
	{
		byte b1 = 100;
		short s1 = (short) b1;//this is explicit conversion__optional__this will automatically done by compiler in case of narrower to wider assignment
		int i = (int) s1;
	    double d1 = (double) i;  
		double d2 = (double) s1;
		double d3 = (double) b1;
		System.out.println("done");
	}
}