class M2 
{
	public static void main(String[] args) 
	{
		if(args < 3)
		{
		  System.out.println("enter three argument");
		  return;
		}
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
		int min = i < j ? (i<k ? i:k) : (j<k ? j:k);
		System.out.println(min);
	}
}
