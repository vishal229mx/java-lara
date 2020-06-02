interface A
{
	int test();
} 
class M6
{
	public static void main(String[] args) 
	{
		A a2 = () -> 2000;//if we are returning a value bt dont require to specify return
		int i = a2.test();
		System.out.println(i);
	}
}
//if mehtod have any other statment and value to be return straight away specify the value