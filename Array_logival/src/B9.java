//print alternative elements form an int array
import java.util.Arrays;
class B9
{
	public static void main(String[] args) 
	{
		int[] x = { 12,30,500,55,5,35,50,2,0,24};
			System.out.println("array content:" + Arrays.toString(x));
			for (int i = 0; i < x.length; i +=2 )
			{
				System.out.print(x[i] + ", ");
			}
	}
}