//3. WAP to reverse a string firsthalf seprately and 2nd half seprately;

import java.util.Scanner;
class Q3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter something");
		String s1 = sc.next();
		char[] firstHalfchars =
			    s1.substring(0, s1.length()/2).toCharArray();
        char[] secondHalfchars =
			    s1.substring(s1.length()/2, s1.length()).toCharArray();
		char temp;
		for (int i = 0 ;i< (firstHalfchars.length/2) ; i++)
		{
			temp = firstHalfchars[i];
			firstHalfchars[i] = firstHalfchars[firstHalfchars.length-i - 1];
			firstHalfchars[firstHalfchars.length - i - 1] = temp;
		}
        for (int i = 0 ;i< (secondHalfchars.length/2) ; i++)
		{
			temp = secondHalfchars[i];
			secondHalfchars[i] = secondHalfchars[secondHalfchars.length-i - 1];
			secondHalfchars[secondHalfchars.length - i - 1] = temp;
		}
		String s2 = new String(firstHalfchars) + new String(secondHalfchars);
		System.out.println("given string:" + s1);
		System.out.println("reverse string:" + s2);
	}
}
