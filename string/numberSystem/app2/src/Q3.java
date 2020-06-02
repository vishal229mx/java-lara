class  Q3
{
	public static void main(String[] args) 
	{
	   if (args.length < 1)
	   {
		   System.out.println("please enter some value");
		   return;
	   }
	   int i = Integer.parseInt(args[0]);
	   int num = i;
	   int fact = 1;
	   for (int j=1;j<=i ;j++ )
	   {
		   fact = fact*j;
	   }
	   System.out.println(fact);
	}
}
