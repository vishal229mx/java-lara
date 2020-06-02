class A 
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	void performClone()
	{
        try
        {
			A a2 = (A) clone();
		    System.out.println(a2.i);
        }
        catch (CloneNotSupportedException ex)
        {
			ex.printStackTrace();
        }
	}
}
class M4 
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		a1.performClone();
		System.out.println("done");
	}
}
//we cant done cloning on any object by default
//to do the cloning object should be a type of clonable...
//clonable is a marker interface-->>((if it is not having any members))which doesnt have any members