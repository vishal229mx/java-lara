import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter something");
		String s1 = sc.next();
	    char[] chars = s1.toCharArray();
	    char temp;
	    for (int i = 0; i < (chars.length/2); i++) {
			temp = chars[i];
			chars[i] = chars[chars.length - 1 - i];
			chars[chars.length -1 - i] = temp;
		}
	    String s2 = new String(chars);
	    System.out.println("giving string:"+s1);
	    System.out.println("reverse string:"+ s2);
		}
}

