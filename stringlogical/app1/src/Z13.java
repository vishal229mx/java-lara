class Z13 
{
	public static void main(String[] args) 
	{
		String ja = "ja";
		String va = "va";
		
		String s1 = "java";
		String s2 = new String("java");
		String s3 = new String("java");

		String s4 = ja + va;   //in s4,s5,s6 whenever there is reference variable like ja , va in s4 +operator is replacing to new operator
		String s5 = ja + "va";   //if +operator either finds ref variable either in left operand or right it uses a new operator 
		String s6 = "ja" + va;

		String s7 = "ja" + "va";

		System.out.println(s1 == s2 );
		System.out.println(s1 == s3 );
		System.out.println(s1 == s4 );
        System.out.println(s1 == s5 );
		System.out.println(s1 == s6 );
		System.out.println(s1 == s7 );//this is true bcoz s1 and s7 pointing to same object
		
		System.out.println(s2 == s3 );
		System.out.println(s2 == s4 );
        System.out.println(s2 == s5 );
		System.out.println(s2 == s6 );
		System.out.println(s2 == s7 );
	    
		System.out.println(s3 == s4 );
        System.out.println(s3 == s5 );
		System.out.println(s3 == s6 );
		System.out.println(s3 == s7 );
	    
		System.out.println(s4 == s5 );
		System.out.println(s4 == s6 );
		System.out.println(s4 == s7 );
	    
		System.out.println(s5 == s6 );
		System.out.println(s5 == s7 );

		System.out.println(s6 == s7 );
	}
}
