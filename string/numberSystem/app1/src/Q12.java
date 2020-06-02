//12. Find out wether digit are in rising order or not in a given number?
/*
   example1: 12345(yes)
   example2: 12745(no)
   example3: 368(yes)
   example4: 361(no)
   example5: 2579(yes)
   example5: 2574(no)
*/
class Q12
{
	public static void main(String[] args) 
	{
      if (args.length < 1)
      {
		  System.out.println("please enter 1 cla ");
		  return;
      }
	  int num = Integer.parseInt(args[0]);
	  boolean isRaisingOrder = true;
	  //num = 12345
	  int i = num, currentDigit, prevDigit = num % 10;
	  i = i / 10;
	  while (i !=0)
	  {
		  currentDigit = i % 10;
		  if (prevDigit < currentDigit)
		  {
            isRaisingOrder = false;
			break;
		  }
		  prevDigit = currentDigit;
		  i = i / 10;
	  }
	  System.out.println("is digit of " + num + "are in isRaisingOrder:"+isRaisingOrder);
	}
}
