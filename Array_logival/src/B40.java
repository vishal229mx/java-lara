//develop third array with the common element of given two arrays..
/*
example
initial array content : 
          first array : {1,20,3,1,61,3,19,7,61,9,80}
            2nd array : {50,61,3,45,1}
initial array content : 
          3rd array : {1,3,61}
*/
import java.util.Arrays;
class B40
{
	public static void main(String[] args) 
	{
		
		int[] x = {1,20,3,1,61,3,19,7,61,9,80};
		int[] y = {50,61,3,45,1};
		int[] z = new int[5];
		int k = 0;
		int count = 0;
		System.out.println("initial array content:");
		System.out.println("first array:" + Arrays.toString(x));
		System.out.println("second array:" + Arrays.toString(y));
		         int v = 0;
				 outer:
		        for (int i = 0;i < y.length ; i++)
				{
				   for (int j = 0;j < x.length - count ; j++)
				   {
	                   	if (y[i] == x[j])
					    {
							z[k++] = y[i];
							count++;
							continue outer;
					    }	
				   }	
				}
		        int[] z1 = new int[count];
				for (int i = 0;i < z1.length ; i++)
				{
					z1[i] = z[i];
				}
				System.out.println("final first array:" + Arrays.toString(z1));
		        System.out.println("final second array:" + Arrays.toString(y));
	}
}


/*
        int[] x = {1,20,3,1,61,3,19,7,61,9,80};
		int[] y = {50,61,3,45,1};
		System.out.println("first array:" + Arrays.toString(x));
		System.out.println("second array:" + Arrays.toString(y));
		int size = x.length < y.length ? x.length : y.length;
		int[] z = new int[size];
		int count = 0;
		for (int i = 0;i < x.length ; i++)
				{
				   for (int j = 0;j < y.length - count ; j++)
				   {
	                   	if (x[i] == y[j])
					    {
							boolean isAvailable = false;
							for(int k = 0; k < z.length ; k++)
							{
								if(x[i] == z[k])
								{
									isAvailable = true;
									break;
								}
                            }
							if(!isAvailable)
							{
								z[count++] = x[i];
							}
					    }	
				   }	
				}
		        int[] z1 = new int[count];
				for (int i = 0;i < z1.length ; i++)
				{
					z1[i] = z[i];
				}
				System.out.println(" final first array:" + Arrays.toString(z1));
		        System.out.println("final second array:" + Arrays.toString(y));
	}

*/