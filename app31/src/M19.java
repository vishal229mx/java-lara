class M19 
{
	public static void main(String[] args) 
	{
		A  a1 = new C();//object fetching values from super class to sub class
		B b1 = (B) a1;//and assignig to refences of class
		System.out.println("done");
	}
}
//a1 pointing to obj of class c which have all attributes of a,b,c thats why no cte
