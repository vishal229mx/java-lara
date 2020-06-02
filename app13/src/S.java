class  S

{
	public static void main(String[] args) 
	{ 
		System.out.println("main begin");
	    int i =1;
	    dowhileLoop:
		do
		{
		    System.out.println("do-while-begin" + i);
			innerLoop:
			for(int j=10; j<=13; j++)
			{
			
			System.out.println("for loop body begin" + j); 
			if(j == 12)
				{
			      continue dowhileLoop;
			    }
              System.out.println("for loop body end" + j);
			}
			System.out.println("do-while-end" + i);
			i++;
		}
		while (i <=5);
                 System.out.println("main end" + i);
		
	}
}
