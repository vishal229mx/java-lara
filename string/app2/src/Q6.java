//6. Find out how many words are there in given string?

import java.util.Scanner;
class Q6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s1 = sc.nextLine();
	   //String[] words = s1.split(" ");
	   //String[] words = s1.split("\\s"); // s represent white space  it is a symbol allocated to used in a regular expresion 
	    String[] words = s1.split("\\s+"); //you can give any number of spaces coming to gether
		int wordsCount = words.length;
		System.out.println("given string:" + s1);
		System.out.println("length:" + wordsCount);
	}
	
}