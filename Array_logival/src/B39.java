//remove elements of one array from another array..
/*
example
initial array content : 
          first array : {1,20,3,1,61,3,19,7,61,9,80}
            2nd array : {50,61,3,45,1}
initial array content : 
          first array : {20,19,7,9,80}
            2nd array : {50,61,3,45,1}
*/
import java.util.Arrays;
class B39
{
	public static void main(String[] args) 
	{
		
		int[] x = {1,20,3,1,61,3,19,7,61,9,80};
		int[] y = {50,61,3,45,1};
		int count = 0;
		System.out.println("initial array content:");
		System.out.println("first array:" + Arrays.toString(x));
		System.out.println("second array:" + Arrays.toString(y));
		
		        for (int i = 0;i < y.length; i++)
				{
				   for (int j = 0;j < (x.length - count); j++)
				   {
	                   	if (y[i] == x[j])
					    {
							for (int k = j;k < (x.length - count - 1) ; k++)
				            { 
					            x[k] = x[k+1];
				            }
						    j--;
							count++;
					    }	
				   }	
				}
		        int[] z = new int[x.length - count];
				for (int i = 0, j = 0;i < z.length ; i++)
				{
					z[i] = x[i];
				}
				System.out.println("final array content:");
		        System.out.println("first array:" + Arrays.toString(z));
		        System.out.println("second array:" + Arrays.toString(y));
	}
}