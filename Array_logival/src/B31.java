//insert a new element from 4th index. new element is 100. without removing any element
/*
example
initial array content : {1,2,3,5,6,3,9,7,2,9,8}
final array content :   {1,1,2,3,5,100,6,3,9,7,2,9,8}
*/
import java.util.Arrays;
class B31
{
	public static void main(String[] args) 
	{
		
		int[] x = {1,2,3,5,6,3,9,7,2,9,8};
		System.out.println("initial array content:" + Arrays.toString(x));
		int[] x1 = new int[x.length + 1];
		        for (int i = 0;i < x1.length -1  ; i++)
				 {
					x1[i] = x[i];
				}
				for (int i = x1.length - 1;i > 0  ; i--)
				 {
					if (i > 4)
					{
						x1[i] = x1[i - 1];
					}
				}
				x1[4] = 100;	
				System.out.println("final array content:" + Arrays.toString(x1));
	}
}