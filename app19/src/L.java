class  L
{
    static int x=test();//y is indirect here so we can use value of y where y is directly initialized   
     static int y;   
     static int z=y;   
      public static int test() 
	{
		return y;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(x + "," + y+ "," + z );
	}
}
 

