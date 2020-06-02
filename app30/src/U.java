class U  
{
	public static void main(String[] args) 
    {
		int i = 128;
		short j = (short)(byte) i;//series conversion--> 1st change to byte then 2nd change to short
		System.out.println(j);
	}
}
//series or multiple converion is not advisable