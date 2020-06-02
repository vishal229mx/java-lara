class  R
{
     static int i=j + 100;   //j is direct usage bt in under indirect read
     static int j=10;   
    public static void main(String[] args) 
	{
		System.out.println("main:" +i + "," + j);
	}
}
 

