//remove range of elements from a given array
/*
example
initial arrays content : {3,7,15,9,1,12,5,66,4,29,80}

remove from index 3 to 7,(both indexes are inclusive)
final arrays content : {3,7,15,4,29,80}
*/
import java.util.Arrays;
class B50_1
{
	public static void main(String[] args)
	{
		int[] x = {3,7,15,9,1,12,5,66,4,29,80};
		int count = 0;
		System.out.println("initial array:" + Arrays.toString(x));
		for (int i = 3 ; i < x.length -  5 ; i++)
		{
			x[i] = x[i+5];
		}
		int[] y = new int[x.length - 5];
	    for (int i = 0 ; i < y.length  ; i++)
		{
			y[i] = x[i];
		}
		System.out.println("final array:" + Arrays.toString(y));
	}
}	