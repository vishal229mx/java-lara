
import java.io.Console;

public class TestConsole
{
	public static void main(String[] args)
	{
		/*
		Console c1 = System.console();
		Console c2 = System.console();
		Console c3 = System.console();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
         */
		
		Console c1 = System.console();
		System.out.println("enter some thing");
		char[] data = c1.readPassword();
		String s1 = new String(data);
		System.out.println(s1);
	

	}
	
}
