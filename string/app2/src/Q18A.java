//18. Write a java program to reverse a given string 
//with preserving the position of spaces?
/*
test case:
given input			=	abc hello java1 manager
output should be	=	reg anam1 avajo llehcba
*/
import java.util.Scanner;
class Q18A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		String s2 = "";
		char leftChar , rightChar;
		for(int f = 0, b = s1.length() - 1; b >= 0; b--, f++)
		{
			leftChar = s1.charAt(f);
			rightChar = s1.charAt(b);
			System.out.println(f + "," +leftChar+ "," + b + "," + rightChar);
			if(leftChar == ' ')
			{
				s2 += " ";
				f++;
			}
			if(rightChar != ' ')
			{
				s2 += rightChar;
			}
			if(rightChar == ' ' && leftChar != ' ')
			{
				f--;
			}
		}
		System.out.println(s2);
	}
}