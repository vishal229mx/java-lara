//7.Find out given number is even or odd?
class  Q7
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
		   System.out.println("pls pass atleat 1 cmd arg");
	    }  
		int i = Integer.parseInt(args[0]);
		boolean isOdd = (i % 2 == 0) ? false : true;
		if (isOdd)
		{
			System.out.println(i + "is an odd number");
		}
		else
		{
			System.out.println(i + "is an even number");
		}
	}
}
