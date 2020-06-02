class D
{
	public static void main(String[] args) 
	{
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2);                                        
	}
}
/*
  totaly three object one string object is creating non constant pool here one more string object.
   a string object will be creating that is refered by s2
*/