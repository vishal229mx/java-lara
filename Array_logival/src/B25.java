//left shift by one
/*
example
initial array content : {1,2,3,5,6,3,9,7,2,9,8}
final array content :   {2,3,5,6,3,9,7,2,9,8,8}
*/
import java.util.Arrays;
class B25
{
	public static void main(String[] args) 
	{
		int[] x = {1,2,3,5,6,3,9,7,2,9,8};
			System.out.println("array content:" + Arrays.toString(x));
				for (int i = 0;i < x.length - 1 ; i++)
				{
					x[i] = x[i+1];
				}
				
			System.out.println("final array content:" + Arrays.toString(x));
	}
}