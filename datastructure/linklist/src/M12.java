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
	int count=0;
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
		count++;
	}
	void read()
	{ 
	  Node element=first;
	  while(element!=null)
	  {
        System.out.print(element.data+",");
		element=element.ref;
	   }
        System.out.println();
        System.out.println("total="+count);
	}
	boolean serch(int no)
	{
		boolean isAvaiable=false;
		Node element=first;
		while(element!=null)
		{
			if(no==element.data)
			{
              isAvaiable=true;
			  break;
			}
			element=element.ref;
		}
		return isAvaiable;
	}
}
class M12
{
	public static void main(String[] args) 
	{
		LinkedList list=new LinkedList();
	    list.add(10);
	    list.add(20);
	    list.add(40);
	    list.add(35);
	    list.read();
		Scanner sc=new Scanner(System.in);
        System.out.println("enter any element");
		int no=sc.nextInt();
		System.out.println(list.serch(no));
	}
}