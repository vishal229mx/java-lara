//8.Find out immediate next 5 multiple of a given number?
class  Q8
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
		   System.out.println("pls pass atleat 1 cmd arg");
	       return;
		}  
		int i = Integer.parseInt(args[0]);
        int j = i;
		 
		while (j % 5 != 0)
		{
			j++;
		}
        System.out.println("immdediate 5 multiple of " + i + " is " + j);
	}
}
