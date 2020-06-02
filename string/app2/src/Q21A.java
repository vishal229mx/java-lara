//21A. print all substring without 
//reapeting charecter in the given string?
/*
	test case1:
	input	:	abcdhellotest
	output	:	abcdhel

	test case2:
	input	:	abcdhellotes1234pq
	output	:	lotes1234pq

	test case3:
	input	:	abcdhellotes1234pqtxyzj67890fgkmrunyrews
	output	:	txyzj67890fgkmrun

	test case4:
	input	:	txyzj67890fgkmrunyrewsabcdhellotes1234p
	output	:	txyzj67890fgkmrun
*/





import java.util.Scanner;
class Q21A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		String currentLongestSubstring = "";
		char current;
		for(int i = 0; i < s1.length(); i++)
		{
			current = s1.charAt(i);
			if(currentLongestSubstring.indexOf(current) == -1)
			{
				currentLongestSubstring += current;
			}
			else
			{
			    System.out.println(currentLongestSubstring);
				currentLongestSubstring = "";
				currentLongestSubstring += current;
			}
		}
		System.out.println(currentLongestSubstring);
	}
}