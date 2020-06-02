// 41. Find out initial 3  ArmStrong numbers (consider from 11)
class  Q41
{
	public static void main(String[] args) 
	{
		int count = 1;
		for (int num = 11 ; count <= 10 ;num++ )
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
				System.out.print(num + " is a armstrong number");
				count++;
			}
		}
	}
}
