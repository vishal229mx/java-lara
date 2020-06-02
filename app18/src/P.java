class O
{
	
	static
	{
	  	System.out.println("O-sib:");
     
	}
    	public static void main(String[] args) 
	{
		System.out.println("O.main");
    }
    
}
class P
{
	static
	{
	   	System.out.println("P-sib:");
	}

	public static void main(String[] p) 
	{
		System.out.println("P.main begin");
		O.main(null);
		System.out.println("------------");
		O.main(p);
		System.out.println("------------");
		System.out.println("P.main end");
	}
}
