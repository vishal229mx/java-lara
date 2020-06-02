//3.Print middle number from 3 given numbers
class  Q3
{
	public static void main(String[] args) 
	{
		if(args.length < 3)
		{
			System.out.println("pls supply 3 values");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
		int mid = i < j ? (i < k ? (j<k?j:k)): j<k?(i<k?(i:k));
        
		/*
		int middle = 0;
		int min = i < j ? (i < k ? i : k) : (j < k ? j : k);
		int max = i > j ? (i > k ? i : k) : (j > k ? j : k);
		middle = !(i == min || i == max) ? i : (!(j == min || j == max) ? j : k);
		System.out.println("middle no." + middle);
		*/
		System.out.println("middle no." + mid);
	}
}
