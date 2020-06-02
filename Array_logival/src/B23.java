//swap even indexed elements with immediate odd indexed elements
import java.util.Arrays;
class B23
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int[] x = {1,2,3,5,6,3,9,7,2,9,8};
			System.out.println("array content:" + Arrays.toString(x));
				for (int i = 0;i < x.length - 1; i += 2)
				{
						int temp = x[i];
				        x[i]= x[i + 1];
				        x[i + 1] = temp;
				}
			System.out.println("swap array content:" + Arrays.toString(x));
	}
}