class  A
{
	public static void main(String[] args) 
	{
		System.out.println(1);//compilation is success bcoz unchecked exeception..compiler doesnt check trycathch or finally..
		int i = 10/0;           //thats why compilation success and run time exception occurs
		System.out.println(2);
	}
}
