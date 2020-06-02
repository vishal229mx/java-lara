import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class A 
{
	int i,j; 
	A(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	public String toString()
	{
		return "(" + i + "," + j + ")";
	}
}
class M72
{
	public static void main(String[] args) 
	{
		ArrayList<A> list = new ArrayList<>();
		list.add(new A(90,10));
		list.add(new A(0,910));
		list.add(new A(9,0));
		list.add(new A(910,20));
		list.add(new A(190,500));
		System.out.println(list);
		Collections.sort(list, new Comparator<A>()
		{
			public int compare(A a1, A a2)
			{
				return a1.i - a2.i;
			}
		});
        System.out.println(list);
		Collections.sort(list, new Comparator<A>()
		{
			public int compare(A a1, A a2)
			{
				return a1.j - a2.j;
			}
		});
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