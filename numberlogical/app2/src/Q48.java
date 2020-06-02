//48. Find out sum of the digits of a given number in a single digits?
//   123 -> 6
//    67 -> 13 -> 4
//   869 -> 23 -> 5
class Q48
{
	public static void main(String[] args) 
	{
		if (args.length < 1)
		{
			System.out.println("supply one arg");
			return;
		}
		int num = Integer.parseInt(args[0]);
		int sum = 0,sum1 = 0;
		while (num != 0)
		{
			int x = num%10;
			sum = sum + x;
			num /= 10;
		}
		if(sum > 9)
		{
            while (sum != 0)
		    { 
			   int x = sum%10;
			   sum1 = sum1 + x;
			   sum /= 10;
		    }
			System.out.println("sum of no. in single digit is " + sum1);
		}
		else
		{
			System.out.println("sum of no. in single digit is " + sum);
		}
	}
}
