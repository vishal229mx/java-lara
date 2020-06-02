import java.util.Scanner;
class Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		String s1 = sc.next();
		char[] chars = s1.toCharArray();
		for (int i=0;i<chars.length/2 ; i++)
		{
			char temp = chars[i];
			chars[i] = chars[chars.length-1-i];
             chars[chars.length-1-i] = temp;
		}
		s1 = new String(chars);
		System.out.println(chars);
	}
}
