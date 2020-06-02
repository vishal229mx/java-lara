class  F
{
	F()   
	{
		System.out.println("F()");
	}
	F(int i)//this is constructor signature   
	{
		System.out.println("F(int)");
	}
	public static void main(String[] args) 
	{
		F f1=new F();
		System.out.println("-----------");
		F f2=new F();
		System.out.println("-----------");
	}
}
//while developing mutiple constructors you have to take care of data type and argument
//every constructor should have a different signature either no. of arg of data type of arg