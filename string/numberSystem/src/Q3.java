//print middle number from 3 given number
class Q3 
{
	public static void main(String[] args) 
	{
		if (args.length < 3)
		{
			System.out.println("pls supply 3 cla");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
		int middle = 0;
		int min = i < j ?(i< k ? i : k) : ( j< k ? j : k);
		int max = i > j ?(i> k ? i : k) : ( j> k ? j : k);
		middle = !(i == min || i == max) ? i : (! (j == min || j == max) ? j : k);

		System.out.println("middle number:" + middle);
	}
}
