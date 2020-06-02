class Z1 
{
	public static void main(String[] args) 
	{
		String s1 = "hello to all in spl way";
		           //0123456789
       String[] splits = s1.split(" ");
      for (String split : splits )
      {
		  System.out.println(split);
      }
	}
}