import java.util.Scanner;
class A
{
	int data;
	A ref;
	A(int data)
	{
		this.data = data;
	}
}
class M7 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		A a1 = null;
		int data;
		do
		{
			System.out.println("enter element");
			data = sc.nextInt();
			if (a1 == null)
			{
				a1 = new A(data);
			}
			else
			{
				A element = a1;
				while (element.ref != null)
				{
					element = element.ref;
				}
				element.ref = new A(data);
			}
			System.out.println("if you want to continue y/n");
      	}
		while("y".equals(sc.next()));

		A element = a1;
		while (element != null)
		{
			System.out.print(element.data + ", ");
			element = element.ref;
		}
	}
}