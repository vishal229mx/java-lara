class  G
{
	G()   
	{
		System.out.println("G()");
	}
	G(int i)   
	{
		System.out.println("G(int)");
	}
	public static void main(String[] args) 
	{
		G g1=new G();
		System.out.println("-----------");
		G g2=new G(100);
		System.out.println("-----------");
	}
}