//remove all even index elements from a given array
/*
example
initial arrays content : {3,7,15,9,1,12,5,66,4,29,80}
                          0 1 2  3 4  5 6  7 8  9  10
final arrays content : {7,9,12,66,29}
*/
import java.util.Arrays;
class B51
{
	public static void main(String[] args)
	{
		int[] x = {3,7,15,9,1,12,5,66,4,29,80};
		System.out.println("initial array:" + Arrays.toString(x));
		int count = 0;
		for (int i = 0 ; i < x.length /2  ; i++)
		{
			x[i] = x[i + i + 1 ];
			count++;
		}
		int[] y = new int[x.length - count - 1];
	    for (int i = 0 ; i < y.length  ; i++)
		{
			y[i] = x[i];
		}
		System.out.println("final array:" + Arrays.toString(y));
	}
}	

/*
public static void main(String[] args)
	{
		int[] x = {3,7,15,9,1,12,5,66,4,29,80};
		int min = x[0];
		System.out.println("initial array:" + Arrays.toString(x));
		for (int i = 0 ; i < x.length  ; i++)
		{
			if(x[i] == (min - 1))
			{
				min = x[i];
			}
		}
		int count = 0;
		for (int i = 0 ; i < x.length - count ; i++)
		{
			if(x[i] == (min - 1))
			{

			}
		}
		int[] y = new int[x.length - count - 1];
	    for (int i = 0 ; i < y.length  ; i++)
		{
			y[i] = x[i];
		}
		System.out.println("final array:" + Arrays.toString(y));
	}
*/
