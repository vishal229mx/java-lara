//swap first element with last element with temp variable
import java.util.Arrays;
class B21
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int[] x = {1,2,3,5,6,3,9,7,2,9,8};
			System.out.println("array content:" + Arrays.toString(x));
				int temp = x[0];
				x[0]= x[x.length-1];
				x[x.length-1] = temp;
			System.out.println("swap array content:" + Arrays.toString(x));
	}
}