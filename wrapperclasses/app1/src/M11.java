class M11
{
	public static void main(String[] args) 
	{
		String s1 = "10.5";   
		int i = Integer.parseInt(s1);        
		System.out.println("done");
	}
}

/*

Exception in thread "main" java.lang.NumberFormatException: For input string: "1
0.5"
        at java.lang.NumberFormatException.forInputString(Unknown Source)
        at java.lang.Integer.parseInt(Unknown Source)
        at java.lang.Integer.parseInt(Unknown Source)
        at M11.main(M11.java:6)
*/