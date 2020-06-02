class L
{
	public static void main(String[] args) 
	{
		int i=0;
		int j=i++ + i++ + i++ + i++ + i +
			//0     1     2     3     4    =10
			  i-- + i-- + i-- + i-- + i +
	        //4      3     2     1     0    =10
			  i++ + i-- + i++ + i-- + i;
			//0     1      0     1    0     =2
			System.out.println(i);//0
			System.out.println(j);//22
	}
}
