//print array content in the reverse order
import java.util.Arrays;
class B11
{
	public static void main(String[] args) 
	{
		int[] x = { 12,30,500,55,5,35,50,2,0,24};
			System.out.println("array content:" + Arrays.toString(x));
			for (int i = x.length-1; i >= 0; i -- )
			{
				
				System.out.print(x[i] + ", ");
			}
			

	}
}