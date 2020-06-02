//remove an new element from 4th index. without any duplicate..
/*
example
initial array content : {1,2,3,5,6,3,9,7,2,9,8}
final array content :   {1,2,3,5,6,3,9,7,2,9}
*/
import java.util.Arrays;
class B32
{
	public static void main(String[] args) 
	{
		int[] x = {1,2,3,5,6,3,9,7,2,9,8};
		int[] y = new int[x.length - 1];
		System.out.println("array content:" + Arrays.toString(x));
				for(int i = 4;i < x.length - 1  ; i++)
				{
					x[i] = x[i + 1];
				}
				for(int i = 0;i < y.length  ; i++)
				{
					y[i] = x[i];
				}

				System.out.println("final array content:" + Arrays.toString(y));
	}
}