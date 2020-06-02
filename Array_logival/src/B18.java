//find out values which are less than avg value-
import java.util.Arrays;
class B18
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int[] x = { 12,30,500,55,5,35,50,2,24};
			System.out.println("array content:" + Arrays.toString(x));
			for (int i = 0 ; i < x.length ; i++ )
			{
				sum = sum + x[i];
			}
			double avg = (double) sum/x.length;
			System.out.println("Average is:" + avg);
			System.out.println("no.less than avg:");
			for (int i = 0 ; i < x.length ; i++ )
			{
				if (x[i] < avg)
				{
					System.out.print(x[i] + ", ");
				}
			}
	}
}