import java.util.Scanner;
class G
{
	static void test(int i,int j)
	{
		System.out.println(i);
		if (i == j)
		{
			return;
		}
		i++;
		test(i,j);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("starting no.");
		int start = sc.nextInt();
		System.out.println("ending no.");
		int end = sc.nextInt();
		System.out.println();
		test(start,end);
	}
}
