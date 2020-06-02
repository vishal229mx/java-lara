//insert 2 new elements from 4th index. new element is 100, without removing any element
/*
example
initial array content : {1,2,3,5,6,3,9,7,2,9,8}
final array content :   {1,1,2,3,5,100,40,6,3,9,7,2,9,8}
*/
import java.util.Arrays;
class B34
{
	public static void main(String[] args) 
	{
		
		int[] x = {1,2,3,5,6,3,9,7,2,9,8};
		System.out.println("initial array content:" + Arrays.toString(x));
		int[] y = new int[x.length + 2];
		        for (int i = 0;i < x.length ; i++)
				 {
					y[i] = x[i];
				}
				for (int i = y.length - 1;	 i > 4  ; i--)
				{
					y[i] = y[i - 2];
				}
				y[4] = 100;	
				y[5] = 40;	
				System.out.println("final array content:" + Arrays.toString(y));
	}
}