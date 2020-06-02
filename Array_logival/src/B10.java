//print first half and second half separately
import java.util.Arrays;
class B10
{
	public static void main(String[] args) 
	{
		int[] x = { 12,30,500,55,5,35,50,2,0,24};
			System.out.println("array content:" + Arrays.toString(x));
			for (int i = 0; i < x.length; i ++ )
			{
				if (i < x.length/2)
				{
					System.out.print(x[i] + ", ");
					continue;
				}
				else
				{
					System.out.print(x[i] + ", ");
				}
			}
	}
}