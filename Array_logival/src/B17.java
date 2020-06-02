//find out average of all int values from an int array-
import java.util.Arrays;
class B17
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int[] x = { 12,30,500,55,5,35,50,2,24};
			System.out.println("array content:" + Arrays.toString(x));
			for (int i = 1 ; i < x.length ; i++ )
			{
				sum = sum + x[i];
			}
			double avg = (double) sum/x.length;
			System.out.println("Average is:" + avg);
	}
}