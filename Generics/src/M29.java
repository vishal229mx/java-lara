class A <X>
{
	X obj;
}
class M29 
{
	public static void main(String[] args) 
	{
		A <? super Q> a1 = null;
		a1 = new A<Q>();          
		a1 = new A<P>();
		a1 = new A<Object>();
		System.out.println("done");
	 }
}

//it is opposites of wild card extends 
//wild card alone -->> no boundries
//wild card extends something -->> same or lower  boundries
//wild card super something -->> same or upper boundries