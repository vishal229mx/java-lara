//swap even indexed elements with immediate odd indexed elements..without temp
/*
example
initial arrays content : {3,7,15,9,1,12,5,66,4,29,80}
final arrays content : {7,3,9,15,12,1,66,5,29,4,80}
*/
import java.util.Arrays;
class B49
{
	public static void main(String[] args)
	{
		int[] x = {3,7,15,9,1,12,5,66,4,29,80};
		System.out.println("initial array:" + Arrays.toString(x));
		for (int i = 0 ; i < x.length  ; i++)
		{
			if(i % 2 != 0)
			{
				x[i-1] = x[i-1] + x[i];
				x[i] = x[i-1] - x[i];
				x[i-1] = x[i-1] - x[i];
			}
		}
		System.out.println("final array:" + Arrays.toString(x));
	}
}	