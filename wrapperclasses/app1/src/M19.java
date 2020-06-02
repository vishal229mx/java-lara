class M19
{
	public static void main(String[] args) 
	{
		int i = 10;
		double j =10.5;
		j = i;
		Double obj1 = new Double(20);
		Integer obj2 = new Integer(20);
		obj1 = obj2;
		System.out.println("done");
	}
}
//in case of derieved data type only auto upcasting

/*

M19.java:10: error: incompatible types: Integer cannot be converted to Double
                obj1 = obj2;
                       ^
1 error
*/