package pack1;
class K
{
	public static void main(String[] args) 
	{
		int assert = 10;//after jdk1.4 assert is keyword not identifier we cannot use assert as identifier
		System.out.println(assert);
	}
}

//we can compile and run this assert with use of -source 1.3 like-->(((E:\lara\assertions\src>javac -d ../classes -source 1.3 pack1/K.java)))
