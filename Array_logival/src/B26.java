//left rotate by one
/*
example
initial array content : {1,2,3,5,6,3,9,7,2,9,8}
final array content :   {2,3,5,6,3,9,7,2,9,8,1}
*/
import java.util.Arrays;
class B26
{
	public static void main(String[] args) 
	{
		int[] x = {1,2,3,5,6,3,9,7,2,9,8};
		int temp = x[0];
			System.out.println("array content:" + Arrays.toString(x));
				for (int i = 0;i < x.length - 1 ; i++)
				{
					x[i] = x[i + 1];
				}
				x[x.length - 1] = temp;
			System.out.println("final array content:" + Arrays.toString(x));
	}
}