//print only even numbers from an int array
import java.util.Arrays;
class B12
{
	public static void main(String[] args) 
	{
		int[] x = { 12,30,500,55,5,35,50,2,0,24};
			System.out.println("array content:" + Arrays.toString(x));
			for (int i = 0; i < x.length; i++ )
			{
				if (x[i] % 2 == 0)
				{
					System.out.print(x[i] + ", ");
				}
			}
			

	}
}