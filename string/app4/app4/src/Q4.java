import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter something");
		String s1 = sc.next();
		String s2 = s1.charAt(s1.length()-1)+reverse(s1.substring(0,s1.length()-1));
	}
}
