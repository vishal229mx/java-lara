class I 
{
	public static void main(String[] args) //any no of closable resources can be open in the try paranthesis
	{
		System.out.println("main begin");
		try(H h1 = new H();
		    H h2 = new H()) //JDK 1.7
   		{
			System.out.println("from try");
		}
		catch( Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			System.out.println("from finally");
		}
		System.out.println("main end");
	}
}
//....in try any argument is closable type......all file stmts are opened in try parantesis no need of closing automatically closed 
//bcoz try block is closable type and close all open file content
//this is known as--> auto resource closing

//conditions---
//1.which ever resources you are trying to open in try block that should be closable type
//2.this closable resouce are local to try ... they are not used outside of try
//3.both h1 and h2 cannot be reinitilized in the try ... bcoz they are acting as final