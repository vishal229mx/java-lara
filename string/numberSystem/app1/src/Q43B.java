//import java.util.Scanner;
class Q43B 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=5-1; j>=i;j-- )
			{
				System.out.print(" ");
			}
		System.out.print("*");
		for (int j=1;j<(i-1)*2 ;j++ )
		{
			System.out.print(" ");
		}
		if (i>1)
		{
			System.out.print("*");
		}
		System.out.println("\n");
	}
}
}