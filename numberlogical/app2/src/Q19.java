//19. Assumen given number containing 3 digits.
//    now check it out first two digit sum is 3rd digit or not?
class Q19 
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("pls supply 3 digits");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int lastdigit = i % 10;
		int sum=0;
		while (i != 0)
		{
			i = i/10;
			int x = i % 10;
            sum = sum + x;
		}
		if (sum == lastdigit)
		{
            System.out.println(true);
		}
		else
		{
            System.out.println(false);
		}
		
	}
}
