class Z14
{
	public static void main(String[] args) 
	{
		String ja = "ja";
		String va = "va";
		
		String s1 = "java";
		String s2 = new String("java");
		String s3 = new String("java");

		String s4 = ja.concat(va);  //we replaced + operator with concat mehtod from where there is referance variable 
		String s5 = ja.concat("va");    
		String s6 = "ja".concat(va);//concat inernally uses + operator thatswhy new operator is used

		String s7 = "ja".concat("va");//also replaced all + oprator from everywhere
		                              //in the arg of concat method it passes ref variable so "va" here acts as ref variable 
									  //thats why +  operator replaced with new operator

		System.out.println(s1 == s2 );
		System.out.println(s1 == s3 );
		System.out.println(s1 == s4 );
        System.out.println(s1 == s5 );
		System.out.println(s1 == s6 );
		System.out.println(s1 == s7 );
		
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
