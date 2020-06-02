//14 find out total digit of given number?
class  Q14
{
	public static void main(String[] args) 
	{
		
		if (args.length < 1)
      {
		  System.out.println("please enter 2 cla ");
		  return;
      }
	   int i = Integer.parseInt(args[0]);
	 // int count = args[0].length();
	  //System.out.println(count);
	  int j =0;
	  for (;i !=0 ;i = i/10 )
	  {
		  j++;
	  }
	  System.out.println(j);

	}
}
