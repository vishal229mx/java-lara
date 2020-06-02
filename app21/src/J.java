class  J
{
	J(int i,int j)   
	{
		System.out.println("J(int,int)");
	}
	I(int i, double j)   
	{
		System.out.println("J(int,double)");
	}
	public static void main(String[] args) 
	{
		J j1=new J(1,2);
		System.out.println("-----------");
		J j2=new J(1,2.5);
		System.out.println("-----------");
		System.out.println("main end");
	}
}