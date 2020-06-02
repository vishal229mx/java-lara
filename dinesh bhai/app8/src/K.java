class K
{
	public static void main(String[] args) 
	{
		System.out.println("main-begin");
		int i = 20;                    
		for(i = 0;i <= 70;i += 10)   
		{
			System.out.println("loop body");
			System.out.println("loop body:" + i);
			System.out.println("----------------");
		}
		System.out.println("main-end" + i); //80
	}
}
//i is initilized to 20 but later reinitized to 0..so it is same as previous program