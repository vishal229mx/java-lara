class T  
{
	public static void main(String[] args) 
    {
		int i = 128;
		short j = (byte) i;
		System.out.println(j);
	}
}
//if req one is int then go for int
//if req one is short then go for short

//dont go for any other narrow data type