//10. Write a java program to count the total 
//number of occurrences of a given character in a string?
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Q10C
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		//abcabcabcabc
		//0123456789
		System.out.println("Enter a char to search");
		char c1 = sc.next().charAt(0);
		//b
		int count = 0;
		/*int index = 0;
		while ((s1.indexOf(c1, index)) != -1)
		{
			count ++;
			index ++;
		}
		*/
		
		int index = s1.indexOf(c1, 0);
		while (index != -1)
		{
			count ++;
			index = s1.indexOf(c1, index + 1);
		}
		
		System.out.println("occurances:" + count);
	}
}
//advisble to use this logic