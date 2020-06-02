//print first half and second half in the reverse way saparately-
import java.util.Arrays;
class B13
{
	public static void main(String[] args) 
	{
		int[] x = { 12,30,500,55,5,35,50,2,0,24};
			System.out.println("array content:" + Arrays.toString(x));
			System.out.println("first half in the reverse:");
			for (int i = x.length/2 - 1 ; i >= 0 ; i-- )
			{
				System.out.print(x[i] + ", ");
			}
			System.out.println();
			System.out.println("second half in the reverse:");
			for (int i = x.length - 1 ; i >= x.length/2 ; i-- )
			{
				System.out.print(x[i] + ", ");
			}
            System.out.println();
			System.out.println("final array content:" + Arrays.toString(x));
	}
}