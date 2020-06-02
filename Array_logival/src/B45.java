//develop third array with every element of given two arrays..
//note: consider both array element one by one.
/*
example
          first arrays content : {3,7,15,9,1,12,5}
      second arrays content : {45,50,60,55}
      third arrays  : {3,7,15,9,45,1,50,12,60,5,55}
*/
import java.util.Arrays;
class B45
{
	public static void main(String[] args)
	{
		int[] x = {3,7,15,9,1,12,5};
		int[] y = {45,50,60,55};
		int size = x.length + y.length ;
		int[] z = new int[size];
		System.out.println("first array:" + Arrays.toString(x));
		System.out.println("second array:" + Arrays.toString(y));
		for (int i = x.length - 1 ,j = y.length - 1, k = size - 1; (i > 0 || j > 0) ; i--,j--)
		{
            if (j >= 0)
			{
				z[k--] = y[j];
			}
			if (i >= 0)
			{
				z[k--] = x[i];
			}
		}
		System.out.println("third array:" + Arrays.toString(z));
	}
}	