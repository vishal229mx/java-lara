// 42. Find out all ArmStrong numbers between two given numbers?
class  Q42
{
	public static void main(String[] args) 
	{
		if (args.length < 2)
		{
			System.out.println("supply two arg");
			return;
		}
		int num = Integer.parseInt(args[0]);
		int num1 = Integer.parseInt(args[1]);
		int count = 1;
		for ( ; num <= num1 ; num++ )
		{
			int i = num, j = num;
			int count1 = 0;
			while (i != 0)
			{
			   i = i / 10;
			   count1++;
			}
			int sum = 0, digit, digitPowerValue = 1;
			while (j != 0)
			{
				digit = j % 10;
				digitPowerValue = 1;
				for (int k = 1; k <= count1; k++)
				{
					digitPowerValue = digitPowerValue * digit;
				}
				sum += digitPowerValue;
				j = j / 10;
			}
			if (num == sum)
			{
				System.out.print(num + ", ");
			}
		}
	}
}
