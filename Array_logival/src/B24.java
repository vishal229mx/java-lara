//reverse the array by swaping
import java.util.Arrays;
class B24
{
	public static void main(String[] args) 
	{
		int[] x = {1,2,3,5,6,3,9,7,2,9,8};
		
			System.out.println("array content:" + Arrays.toString(x));
				for (int i = 0;i < x.length / 2 ; i++)
				{
					int temp = x[i];
					x[i] = x[x.length - 1 - i];				
				    x[x.length - 1 - i] = temp;
				}
				
			System.out.println("final array content:" + Arrays.toString(x));
	}
}