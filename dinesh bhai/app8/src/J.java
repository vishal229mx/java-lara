class J
{
	public static void main(String[] args) 
	{
		System.out.println("main-begin");
		int i;                    
		for(i = 0;i <= 70;i += 10)   
		{
			System.out.println("loop body");
			System.out.println("loop body:" + i);
			System.out.println("----------------");
		}
		System.out.println("main-end" + i);
	}
}
// as i got declared before for loop hence it can be use after for loop..if its declares in for loop then it is local to for loop only