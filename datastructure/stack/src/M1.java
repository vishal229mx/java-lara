//stack        
class Node
{
	int data;
    Node next;
	Node(int data)
	{
		this.data = data;
	}
}

class Stack
{
	    Node first,last;
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
				last = last.next;
			}
	    }

	void read()
	{
		Node element = first;
		while(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.next;
		}
	}


     int readLast()
	 {
		return last.data;
	 }

     void removeLast()
	 {
		
		if (first == null)  //if there is no elements then return
		{
			return;
		}
		Node element = first;
		if (element.next == null) //if there is only one element..then there will be no null pointerexception
		{
			first = last = null;
			return;
		}
		while (element.next != last)
		{
			element = element.next;
		}
		element.next = null;
		last = element;
	 }

}
class M1
{
	public static void main(String[] args)
	{
		Stack stack = new Stack();
		stack.add(10);
		stack.add(20);
		stack.add(40);
		stack.add(60);
		stack.add(25);
		stack.read();

		stack.removeLast();
		System.out.println();
		stack.read();
		
		stack.removeLast();
		System.out.println();
		stack.read();
		
		stack.removeLast();
		System.out.println();
		stack.read();

		stack.removeLast();
		System.out.println();
		stack.read();

		stack.removeLast();
		System.out.println();
		stack.read();
	}
}
//this is same as singular link stack