class  Q
{
    static 
	{
	   System.out.println("sib:" + Q.i);//it is consider as indirect usage

	}
     static int i=10;   
    public static void main(String[] args) 
	{
		System.out.println("main:" +i );
	}
}
 

