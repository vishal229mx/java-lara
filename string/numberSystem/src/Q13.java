// swap two int variable without 3rd variable?
class  Q13
{
	public static void main(String[] args) 
	{
		if (args.length < 2)
      {
		  System.out.println("please enter 2 cla ");
		  return;
      }
	  int i = Integer.parseInt(args[0]);
	  int j = Integer.parseInt(args[1]);
	  System.out.println(i + ", " + j);
	  i = i + j;
	  j = i - j;
	  i = i - j;
	  System.out.print(i + ", " + j);
	}
}
