//5.Print true, if sum of any two numbers is a 3rd given number
class  Q5
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
		boolean flag = (i + j == k || j + k == i || i + k == j) ? true : false;
		System.out.println(flag);
	}
}
