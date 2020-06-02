class I
{
}
class J
{
	public static void main(String[] args) 
	{
	   System.out.println("main begin");
       I obj = new I();                    //java.lang.NoClassDefFoundError
	   System.out.println("main end");
	}
}
//if I.class is removed then this error happens