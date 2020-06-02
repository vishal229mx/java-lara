class M32 
{
	public static void main(String[] args) 
	{
		A  a1 = new A();
		if(a1 instanceof B)//to avoid of class cast exc always suggesting to use instance of to determine it is returning true 
		{
			B b1 = (B) a1;
			System.out.println("casting is proper");
		}
		System.out.println("done");
	}
}

/*

done
*/