//remove all the single digit elements from the array..
//type1
/*
example
initial array content : {1,20,3,5,61,3,6,19,7,22,9,80}
final array content :   {20,61,19,22,80}
*/
import java.util.Arrays;
class B35
{
	public static void main(String[] args) 
	{
		
		int[] x = {1,20,3,5,61,3,6,19,7,22,9,80};
		int count = 0;
		System.out.println("initial array content:" + Arrays.toString(x));
		
		        for (int i = 0;i < x.length; i++)
				 {
					if (x[i] < 10)
					{
						for (int j = i;j < (x.length - 1 - count) ; j++)
						{
							x[j] = x[j + 1];
						}
						i--;
						count++;
					}
				}
		        int[] y = new int[x.length - count];
				for (int i = 0;i <= y.length - 1 ; i++)
				 {
					y[i] = x[i];
				 }
				System.out.println("final array content:" + Arrays.toString(y));
	}
}