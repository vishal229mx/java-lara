class K
{
	public static void main(String[] args) 
	{
		int i=0;
		int j=i++ + i + i-- + i + i-- + i-- + i +
			 //0    1    1     0   0     -1    -2         =-1 
			  i++ + i++ + i++ + i + i-- + i + i-- + i +
            //-2     -1    0    1    1    0    0    -1     =-2
			  i++ + i-- + i-- + i + i++ + i++ + i++ + i +
            //-1     0     -1    -2   -2    -1    0    1    =-6
			  i++ + i + i-- + i + i++ + i-- + i++ + i;
			//1     2    2    1    1     2    1     2       =12==3
			//System.out.println(--i);
			System.out.println(i);//2
			System.out.println(j);//3
	}
}
