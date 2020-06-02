class A
{
	A obj;
	protected void finalize()
	{
        System.out.println("from finalize()");
	}
}
class M2
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		a1.obj = a2;
		a2.obj = a3;
		a3.obj = a1;
		a1 = a2 = a3 = null;
		//a1 = a2  = null;//if this is the case finalize() cannot be calling bcoz a1 and a2 pointing to a3
		System.gc();
		System.out.println("done");
	}
}

//if no obj reached form the stack --->> this type of object are called as Islands
//islands are considered as  anondant boz no object is reched form the stack

