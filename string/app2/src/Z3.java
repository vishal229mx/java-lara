import java.util.Scanner;
class  Z3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter some thing");
		String s1 = sc.nextLine();
		int index;
		while ((index = s1.indexOf(' ')) != -1)
		{
			s1 = s1.substring(0, index) + s1.substring(index+1);
		}
		System.out.println(s1);
	}
}
