class  N

{
	public static void main(String[] args) 
	{ 
		System.out.println("main begin");
	    int i =1;
	    do
		{
		    System.out.println("do-while-begin" + i);
			for(int j=10; j<=13; j++)
			{
			
			System.out.println("for loop body" + j);   
			}
			System.out.println("do-while-end" + i);
			i++;
		}
		while (i <=5);
                 System.out.println("main end" + i);
		
	}
}
