//print true , if sum of square of any 2 number is a 3rd given number
class  Q6
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
		boolean flag = (((i*i + j*j) == k) || ((j*j + k*k)==i) || ((k*k + i*i) ==j)) ? true : false;
		System.out.print(flag);
	}
}
