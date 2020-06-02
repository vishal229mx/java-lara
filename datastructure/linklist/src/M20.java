//circuler linked list
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
	  
	void replaceFromToTo(int valueToSearch,int num)
	{
		Node element=first;
		 if(element!=null)
		 {
		  if(element.data==valueToSearch)
		  {
		   element.data=num;
		   return;
		  }
	      element=element.ref;
		 }
	   while(element!=null && (element !=first))
	   {
		   if(element.data==valueToSearch)
		   {
			  element.data=num;
			  break;
		   }
		   element=element.ref;
	   }
	}	
}
class M20
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
	    list.add(45);
		list.read();
        System.out.println();
		list.replaceFromToTo(25,100);
	    list.read();
	}
}