import java.util.Scanner;
class Node
{
	int data;
	
	Node ref;	
	Node(int data)
	{
	 this.data=data;
	}
}
class LinkedList
{
	Node first,last;
	void add(int data)
	{
		if(first==null)
		{
			first=new Node(data);
			last=first;
		}
		else
		{
		 last.ref=new Node(data);
		 last=last.ref;
		}
	    last.ref=first;
	}
	void read()
	{ 
	  Node element=first;
	  if(element !=null)
	  {
        System.out.print(element.data+",");
	    element=element.ref;
	  }
	  while(element!=null && (element !=first))
	  {
        System.out.print(element.data+",");
		element=element.ref;
	  }
	}
	int leftTo(int valueToSearch)
	{
		Node element=first;
		boolean flag=false;
		while(element.ref!=null)
		{
			if(element.ref.data==valueToSearch)
			{
			   flag=true;
			   break;
			}
			element=element.ref;
		}
         return flag?element.data:-1;
	}
}
class M17
{
	public static void main(String[] args) 
	{
		LinkedList list=new LinkedList();
	    list.add(10);
	    list.add(20);
	    list.add(40);
	    list.add(25);
	    list.add(39);
	    list.add(30);
	    list.add(15);
	    list.add(35);
	    list.read();
        System.out.println(); 
        System.out.println(list.leftTo(39)); //25
        System.out.println(list.leftTo(40)); //20
        System.out.print(list.leftTo(10)); //some exception (or)  45
	}
}