class O  
{
	public static void main(String[] args) 
	{
		System.out.println("main-begin");
		int i = 20;                    
		for(; ;)   
		{
			System.out.println("loop body");
			System.out.println("loop body:" + i);
			System.out.println("----------------");
			i += 10;
		}
	}
}
// all three portion of for loop header are optional
// if their is no boolean condition then it alwys  consider it true....so alwys condition is true..it is infinite loop
//this wiil be syntactically correct so compilation successfull..but never ending execution becz of never ending for loop
