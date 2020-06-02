class G 
{
	public static void main(String[] args) 
	{
		final int[] x = new int[3];
		x = new int[3];
		System.out.println("done");
	}
}
//x declared as final
//even though same length of array x we cannot reintialize x 

/*

G.java:6: error: cannot assign a value to final variable x
                x = new int[3];
                ^
1 error
*/