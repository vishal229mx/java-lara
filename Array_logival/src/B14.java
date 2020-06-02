//find out max value from the given array-
import java.util.Arrays;
class B15
{
	public static void main(String[] args) 
	{
		int[] x = { 12,30,500,55,5,35,50,2,24};
			System.out.println("array content:" + Arrays.toString(x));
			
			int max = x[0];
			for (int i = 1 ; i < x.length ; i++ )
			{
				if (x[i] > max)
				{
					max = x[i];
				}
			}
			System.out.println("max value:" + max);
	}
}