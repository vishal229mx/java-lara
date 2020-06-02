import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter something");
		String s1 = sc.next();
		String s2 = reverse(s1.substring(0,s1.length()/2)) + reverse(s1.substring(s1.length()/2, s1.length()));
		System.out.println("giving string:"+s1);
		System.out.println("reverse string:"+s2);
	}
	private static String reverse(String s1)
	{
		if (s1.length()==0) {
			return "";
			
		}
		return s1.charAt(s1.length()-1) + reverse(s1.substring(0,s1.length()-1));
	}

}
