package pack1;
class C
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert false : "Something went wrong";
		System.out.println(2);
	}
}
//this is a second type of assert stmt -- here this is simple assert message