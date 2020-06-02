class W  
{
	public static void main(String[] args) 
	{
		System.out.println("main-begin");
		for(int i = 1,System.out.println("init"); // we can declare any number of variable separting by comma(,) but here we the decalring  variable with sop..its is voilation of rule
			test(i);                              //In initilization portion we can not declare variable and sop with comma ...error..compiler looking for another varibale declaration after comma
			i++,System.out.println("change :" + i))
		{
			System.out.println("loop body : " + i );
		}
		System.out.println("main end:");
	}
	public static boolean test(int i)
	{
		boolean b1 = (i <= 5);
		System.out.println(" boolean test for " + i + " : " + b1);
		return b1;
	}
}
//not printing i outisde the for loop bcz i is local to for loop