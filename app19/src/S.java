class  S
{
     static int i=S.j;//indirect usage and indirect read
     static int j=10;   
    public static void main(String[] args) 
	{
		System.out.println("main:" +i + "," + j);
	}
}
 

