//read the index which has  value of previous two values sum
import java.util.Arrays;
class B20
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int[] x = {1,2,3,5,6,3,9,7,2,9,8};
			System.out.println("array content:" + Arrays.toString(x));
			for (int i = 2 ; i < x.length - 1 ; i++ )
			{
				if ((x[i-1] + x[i-2]) == x[i])
				{
					System.out.print(i + ",  ");
				}
			}
	}
}