class A <X>
{
	X obj;
}
class M23 
{
	public static void main(String[] args) 
	{
		A <?> a1 = null;
		a1 = new A<Integer>();
		a1 = new A<Object>();
		a1 = new A<P>();
		a1 = new A<String>();
		a1 = new A<Thread>();
		System.out.println("done");
	}
}
//if reference variable having a ? --> question mark, then object can have any data type

//? -->> is treated as wild card character