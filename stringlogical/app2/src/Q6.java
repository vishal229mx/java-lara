//6. Find out how many words are there in a given string?
import java.util.Scanner;
class  Q6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		//String[] words = s1.split(" ");
		//String[] words = s1.split("\\s"); // "\\s" represents white space used in the regular exp to rep. white space //it only rep. single white space 
		String[] words = s1.split("\\s+"); // "\\s+" here + represents min 1 more than any no. of white spaces 
		int wordsCount = words.length;
		System.out.println("Given String: " + s1);
		System.out.println("length: " + wordsCount);
	}
}
