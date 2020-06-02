//8. find out immedate next 5 multiple of given number?
class M7 
{
	public static void main(String[] args) 
	{
		
		if (args.length < 1)
		{
			System.out.println("enter two argument");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int j = i;
		while (i%5 != 0)
		{
			j++;
		}
		System.out.print("immediate next 5 multiple:"+i+ "," +j);
	}
}
