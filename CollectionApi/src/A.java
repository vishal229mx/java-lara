import java.util.*;
class A 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v1 = new Vector<>();
		v1.add(90);
		v1.add(910);
		v1.add(910);
		v1.add(901);
		v1.add(900);
		Enumeration e1 = v1.elements();//iterating one by one
		while (e1.hasMoreElements())
		{
		     System.out.println(e1.nextElement());
		}
		Iterator it = v1.iterator();//iterating one by one
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
