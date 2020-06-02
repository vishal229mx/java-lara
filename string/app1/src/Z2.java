class Z2 
{
	public static void main(String[] args) 
	{
		String s1 = "abc;xyz;123;hello;test";
		           //0123456789
       String[] splits = s1.split(";");
      for (String split : splits )
      {
		  System.out.println(split);
      }
	}
}
/*
   by using semicolon seprator 

   substring and splits method both will be using very properly
*/