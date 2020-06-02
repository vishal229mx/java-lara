//find out all missed numbers from a given int array between min and max values..
/*
example
initial array content : 
          given array : {3,7,15,9,1,12,5}
      missed elements : {2,4,6,8,10,11,13,14}
*/
//min=1, max =15 //max - min + 1
import java.util.Arrays;
class B42
{
	public static void main(String[] args) 
	{


  int min = x[0], max = x[0];
  for(int i = 1; i< x.length; i++)
  {
	  if(x[i] < min)
	  {
		  min = x[i];
	  }
	  if(x[i] > max)
	  {
		  max = x[i];
	  }
  }
  int[] y = new int[max + 1];
  int replace = (min - 1) == 0 ? (min - 2) : (min - 1);
  for(int i = 0; i< x.lenght; i++)
  {
	  y[x[i]] = replace;
  }
  System.out.println("missed element");
  for(int i = min + 1; i< y.lenght; i++)
  {
	  if(y[i] != replace)
	  {
		  System.out.print(i + ", ");
	  }
  }

	/*	
		int[] x = {3,7,15,9,1,12,5};
		//int size = 15 - x.length  ;
		//int[] y = new int[size];
		int count = 0;
		System.out.println("given array:" + Arrays.toString(x));
		outer:
		for (int i = 1;i <= 15 ; i++)
		{
			for (int j = 0;j < x.length ; j++)
			{
	             if (i == x[j])
			     {
					 continue outer;
				 }
		    }
			//y[count++] = i;
			System.out.print(i + ", ");
		}
		//System.out.println("missed elements:" + Arrays.toString(y));
	}
}		 
*/