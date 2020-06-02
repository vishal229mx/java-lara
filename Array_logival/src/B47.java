//develop third array with first array and then 2nd array in the reverse order..
/*
example
          first arrays content : {3,7,15,9,1,12,5}
      second arrays content : {45,50,60,55}
      third arrays  : {3,7,15,9,1,12,5,55,60,50,45}
*/
import java.util.Arrays;
class B47
{
	public static void main(String[] args)
	{
		int[] x = {3,7,15,9,1,12,5};
		int[] y = {45,50,60,55};
		int size = x.length + y.length ;
		int[] z = new int[size];
		int k = 0;
		System.out.println("first array:" + Arrays.toString(x));
		System.out.println("second array:" + Arrays.toString(y));
		for (int i = 0 ; i < x.length  ; i++)
		{
			z[k++] = x[i];
		}
		for (int j = y.length - 1;  j >= 0 ; j--)
		{
			z[k++] = y[j];
		}
		System.out.println("third array:" + Arrays.toString(z));
	}
}	