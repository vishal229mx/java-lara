//develop third array with every element of given two arrays..
//note: consider both array element one by one.
//first array ==> left to right 
//second array ==> right to left   
/*
example
          first arrays content : {3,7,15,9,1,12,5}
      second arrays content : {45,50,60,55}
      third arrays  : {3,55,7,60,15,50,9,45,1,12,5}
*/
import java.util.Arrays;
class B46
{
	public static void main(String[] args)
	{
		int[] x = {3,7,15,9,1,12,5};
		int[] y = {45,50,60,55};
		int size = x.length + y.length ;
		int[] z = new int[size];
		System.out.println("first array:" + Arrays.toString(x));
		System.out.println("second array:" + Arrays.toString(y));
		for (int i = 0 ,j = y.length - 1,k = 0 ; (i < x.length || j >= 0) ; i++,j--)
		{
			if (i < x.length)
			{
				z[k++] = x[i];
			}
			if (j >= 0)
			{
				z[k++] = y[j];
			}
		}
		System.out.println("third array:" + Arrays.toString(z));
	}
}	