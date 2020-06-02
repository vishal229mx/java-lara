//remove all the duplicates from the array..
/*
example
initial array content : {1,20,3,1,61,3,6,19,7,61,9,80}
final array content :   {1,20,3,61,6,7,9,80}
*/
import java.util.Arrays;
class B38
{
	public static void main(String[] args) 
	{
		
		int[] x = {1,20,3,1,61,3,6,19,7,61,9,80};
		int count = 0;
		System.out.println("initial array content:" + Arrays.toString(x));
		
		        for (int i = 0;i < x.length; i++)
				{
				   for (int j = 1;i < x.length; i++)
				   {
	                   	if (x[i] == x[j])
					    {
						   count++;
					    }	
				   }	
				}
		        int[] y = new int[x.length - count];
				for (int i = 0, j = 0;i < x.length ; i++)
				 {
					if (x[i] % 2 != 0)
					{
						y[j++] = x[i];
					}
					
				 }
				System.out.println("final array content:" + Arrays.toString(y));
	}
}