//remove all the single digit elements from the array..
//type2
/*
example
initial array content : {1,20,3,5,61,3,6,19,7,22,9,80}
final array content :   {20,61,19,22,80}
*/
import java.util.Arrays;
class B36
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
						count++;
					}
				}
		        int[] y = new int[x.length - count];
				for (int i = 0, j = 0;i < x.length ; i++)
				 {
					if (x[i] > 10)
					{
						y[j++] = x[i];
					}
					
				 }
				System.out.println("final array content:" + Arrays.toString(y));
	}
}