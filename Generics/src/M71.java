import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class A 
{
	int i; 
	A(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i = " + i;
	}
}
	class B implements Comparator <A>
	{
		public int compare(A a1, A a2)
		{
			return a1.i - a2.i;
		}
	}
class M71
{
	public static void main(String[] args) 
	{
		ArrayList<A> list = new ArrayList<>();
		list.add(new A(90));
		list.add(new A(0));
		list.add(new A(9));
		list.add(new A(910));
		list.add(new A(190));
		System.out.println(list);
		Collections.sort(list, new B());
        System.out.println(list);
	}
}
/*
Skeleton of the comparable interface

public interface Comparator<T>
{
	public int compare(T element1, T element2)
}

*/