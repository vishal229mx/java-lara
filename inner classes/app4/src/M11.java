@FunctionalInterface
interface A
{
	int test(int i, int j);
	int test(int i);
} 
class M11
{
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
//compiler will not allow to declare interface as a functional interface if there are more than one method in the interface

/*


M11.java:1: error: Unexpected @FunctionalInterface annotation
@FunctionalInterface
^
  A is not a functional interface
    multiple non-overriding abstract methods found in interface A
1 error
*/