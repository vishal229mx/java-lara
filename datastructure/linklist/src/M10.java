class Node
{
	int data;
	Node ref;

	Node(int data)
	{
		this.data = data;
	}
}
class LinkedList
{
	Node first, last;

	void add(int data)
	{
		if (first == null)
		{
			first = new Node(data);
			last = first;
		}
		else
		{
			last.ref = new Node(data);
			last = last.ref;
		}	
	}

	void read()
	{
		Node element = first;
		while (element != null)
		{
			System.out.print(element.data + ", ");
			element = element.ref;
		}
	}
}
class M10
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(60);
		list.read();
	}
}
//no limitations this is perfect data structure