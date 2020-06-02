class A <X>
{
	X obj;
}
class M25 
{
	public static void main(String[] args) 
	{
		A <? extends Number> a1 = null;  //if ref  is a wild card that extends any class.. then object should be a data type of same number or sub class to number
		a1 = new A<Number>();          
		a1 = new A<Integer>();
		a1 = new A<Byte>();
		System.out.println("done");
	 }
}