class Z 
{
	public static void main(String[] args) 
	{
		String s1 = "hello to all in spl way";
		           //0123456789
       int from = 0, to= s1.indexOf(' ');
	   while (to != -1)
	   {
		   System.out.println(s1.substring(from, to));
		   from = to + 1;
		   to = s1.indexOf(' ', (to + 1));
	   }
	   System.out.println(s1.substring(from));
	}
}
//printing the string word by word                                                                                                   