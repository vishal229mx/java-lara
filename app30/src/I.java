class I  
{
	public static void main(String[] args) 
    {
		int i = 100;
		byte b1 = (byte) i;//explicit converision from wider to narrower is only possible when the value of wider data type is in range of narrrower
		System.out.println("done");
	}
}