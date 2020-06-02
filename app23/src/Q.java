class Q 
{
	Q()
	{
		//super calling stmt
		//all iib stmt
	    System.out.println("Q()");
	}
     {
	    System.out.println("Q-IIB4");
	    System.out.println("Q-IIB5");
	    System.out.println("Q-IIB6");
	 }
	 Q(int i)
	{
		//super calling stmt
		//all iib stmt
	    System.out.println("Q(int)");
	}
    
	{
	    System.out.println("P-IIB1");
	    System.out.println("P-IIB2");
	    System.out.println("P-IIB3");
	 }
	public static void main(String[] args) 
	{   Q q1 =new Q();
		System.out.println("---------");
	    Q q2 =new Q(10);
	    System.out.println("---------");
	}
}