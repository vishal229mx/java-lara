class W
{
	    static int i = test();
	    static int j = test();

		public static int test() 
	{
		System.out.println("from test1:" + i + "," + j); //0,0
		i += 5;    //5
		j += i + 5; //10
		main(null);
	    i += 5;   //30
		j += i + 5; //80
		System.out.println("from test2:" + i + "," + j); //30,80
		return i + j + 5; //115
	}
	public static void main(String [] args) 
	{
	
		System.out.println("main:" + i + "," + j); //5,10 //30,80
        i += j + 10;  //25
        j += i + 10;  //45
	}
}