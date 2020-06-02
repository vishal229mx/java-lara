// 40. Find out given number is an ArmStrong number or not?
class  Q40
{
	public static void main(String[] args) 
	{
		if (args.length < 1)
		{
			System.out.println("supply one arg");
			return;
		}
		int num = Integer.parseInt(args[0]);
		int i = num, j = num;
		int count = 0;
		while (i != 0)
	    {
		   i = i / 10;
		   count++;
	    }
		int sum = 0, digit, digitPowerValue = 1;
		while (j != 0)
		{
			digit = j % 10;
			digitPowerValue = 1;
			for (int k = 1; k <= count; k++)
			{
				digitPowerValue = digitPowerValue * digit;
			}
			sum += digitPowerValue;
			j = j / 10;
		}
		if (num == sum)
		{
			System.out.print(num + " is an armstrong number");   
		}
        else
		{
             System.out.print(num + " is not an armstrong number");
		}
	}
}
