//insert a new element at 4th index. new elemet is 100.
/*
example
initial array content : {1,2,3,5,6,3,9,7,2,9,8}
final array content :   {1,1,2,3,5,6,3,9,7,2,9}
*/
import java.util.Arrays;
class B29
{
	public static void main(String[] args) 
	{
		int[] x = {1,2,3,5,6,3,9,7,2,9,8};
		System.out.println("array content:" + Arrays.toString(x));
		
				for (int i = x.length - 1;i > 0  ; i--)
				{
					if (i > 4)
					{
						x[i] = x[i - 1];
					}
				}
				x[4] = 100;	
		System.out.println("final array content:" + Arrays.toString(x));
	}
}