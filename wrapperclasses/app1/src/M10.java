class M10
{
	public static void main(String[] args) 
	{
		String s1 = "10r";   
		int i = Integer.parseInt(s1);        
		System.out.println("done");
	}
}

/*

Exception in thread "main" java.lang.NumberFormatException: For input string: "1
0r"
        at java.lang.NumberFormatException.forInputString(Unknown Source)
        at java.lang.Integer.parseInt(Unknown Source)
        at java.lang.Integer.parseInt(Unknown Source)
        at M10.main(M10.java:6)
*/