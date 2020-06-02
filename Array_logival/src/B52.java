//element frequency in the given array
/*
example
initial arrays content : {3,7,15,9,1,12,7,66,4,15,12}

output:
3 : 1
7 : 2
15 : 2
9 : 1
12 : 2
66 : 1 
4 : 1

*/
import java.util.Arrays;
class B52
{
	public static void main(String[] args)
	{
		int[] x = {3,7,15,9,1,12,7,66,4,15,12};
		System.out.println("initial array:" + Arrays.toString(x));
		outer:
		for (int i = 0 ; i < x.length ; i++)
		{
			int count = 0;
			for (int j = i ; j < x.length ; j++)
		    {
				if (x[i] == x[j])
				{
					count++;
					if (count > 1)
					{
						continue outer;
					}
				}
		    }
			int count1 = 0;
			for (int j = 0 ; j < x.length ; j++)
		    {
				if (x[i] == x[j])
				{
					count1++;
				}
		    }
			System.out.println(x[i] + ":" + count1);
		}
	}
}
