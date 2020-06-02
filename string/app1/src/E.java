class E
{
	public static void main(String[] args) 
	{
		String s1 = "sanjay";
		String s2 = new String("sanjay");
		System.out.println(s1.equals(s2)); //checking content                                        
		System.out.println(s1==s2);    //memory location                                     
	}
}
/*
 equals method check a content not a memory location equals operator check a memory location;

 s1 is a constant pool and non constant pool refered by s2
*/