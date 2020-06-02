class W 
{
	void test() 
	{
		System.out.println(this);
		System.out.println(super.toString());
	}

    public static void main(String[] args) 
	{
		System.out.println(this);
		System.out.println(super.toString());
	}
}
//"this"  is keyword only use with non static member
//"super"  is keyword only use with non static member