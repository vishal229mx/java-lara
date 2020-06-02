class O  
{
	public static void main(String[] args) 
    {
		int i = 32768;//if data is higher or lower than narrow data type while converting then the value is going to circular way from -32728 to 32767 
		short s1 = (short)i;
		System.out.println(s1);
	}
}
