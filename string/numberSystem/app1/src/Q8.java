//8. find out immedate next 5 multiple of given number?
class  Q8
{
	public static void main(String[] args) 
	{
		if (args.length < 1)
		{
			System.out.println("please supply 1 cla");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int j = i;
		while (j % 5 != 0)
		{
			j++;
		}
		System.out.print("imediate 5 multiple of " + i + "is" + j);
	}
}
