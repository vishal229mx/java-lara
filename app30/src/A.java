//byte < short < int < long < float < double

class A  
{
	public static void main(String[] args) 
	{
		byte b1 = 100;
		short s1 = b1; //short s1 = (short) b1;
		int i = s1;
		double d1 = i; // double d1 = (double) i;  //compiler is automatically converting int into double in compiler
		double d2 = s1;
		double d3 = b1;
		System.out.println("done");
	}
}
//compiler only converting narrower into required wider--> thats why it is autowidery(whenever assigning narrower to wider always converts req one wider automatically by compiler)
//Assigning always from right to left.