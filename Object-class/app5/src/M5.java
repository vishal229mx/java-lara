class A  implements Cloneable
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
class M5
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		a1.performClone();
		System.out.println("done");
	}
}
//clone -- generate duplicate object by taking a content of current object

// Following Methods required to clone any objects---
//1. bcoz of clone() is protected we should call clone mehtod in subclass itself ...
//2. boz clone() return type is Object-- downcasting is required
//3. clone method required  CloneNotSupportedException as try-catch or throws
//4. if object is clonable type then only eligible for cloning operation
