//6. print true if sum of squares of any 2 numbers is a 3rd given number
class  Q6
{
	public static void main(String[] args) 
	{
		if(args.length < 3)
		{
		    System.out.println("please pass atleast 3 numbers");
		}
         int i = Integer.parseInt(args[0]);
         int j = Integer.parseInt(args[1]);
         int k = Integer.parseInt(args[2]);

         boolean flag = ((i*i)+(j*j) == k) || ((k*k)+(j*j) == i) || ((i*i)+(k*k) == j) ? true : false;
         System.out.println(flag);
	} 
}
