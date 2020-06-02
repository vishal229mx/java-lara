//develop third array with every element of given two arrays..
/*
example
          first arrays content : {3,7,15,9,1,12,5}
      second arrays content : {45,50,60,55}
      third arrays  : {3,7,15,9,1,12,5,45,50,60,55}
*/
import java.util.Arrays;
class B43
{
	public static void main(String[] args)
	{
		int[] x = {3,7,15,9,1,12,5};
		int[] y = {45,50,60,55};
		int size = x.length + y.length ;
		int[] z = new int[size];
		System.out.println("first array:" + Arrays.toString(x));
		System.out.println("second array:" + Arrays.toString(y));
		for (int i = 0;i < x.length ; i++)
		{
			z[i] = x[i];
		}
        for (int i = 0;i < y.length ; i++)
		{
			z[x.length + i] = y[i];
		}
		
		System.out.println("third array:" + Arrays.toString(z));
	}
}	