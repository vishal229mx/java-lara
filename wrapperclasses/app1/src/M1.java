class M1 
{
	public static void main(String[] args) 
	{
		int i =10;
		Integer obj1 = new Integer(i);   //boxing
		Integer obj2 = Integer.valueOf(i);   //boxing
		int j = obj1.intValue();  //unboxing 
		int k = obj2.intValue();   //unboxing
		System.out.println("done");
	}
}
//primitive value is storing inside a obj called boxing
//retrieving primitive value from the obj is unboxing.