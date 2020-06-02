//double link list
class Node
{
	int data;
	Node next;
	Node prev;
    
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
			last.next = new Node(data);
			last.next.prev = last;  //for double
			last = last.next;
		}	
	}

	void read()
	{
		Node element = first;
		while (element != null)
		{
			System.out.print(element.data + ", ");
			element = element.next;
		}
	}

	void readInReverse()
	{
		Node element = last;
		while (element != null)
		{
			System.out.print(element.data + ", ");
			element = element.prev;
		}
	}
}	
class M21
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(60);
		list.add(25);
		list.read();
		System.out.println();
		list.readInReverse();
	}
}
